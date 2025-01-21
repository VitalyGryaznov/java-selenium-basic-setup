package com.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvProperties {
    private static Properties properties;

    static {
        properties = loadProperties();
    }

    private static Properties loadProperties() {
        Properties props = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(".env")) {
            props.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("An error occurred while loading .env file", e);
        }
        return props;
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}