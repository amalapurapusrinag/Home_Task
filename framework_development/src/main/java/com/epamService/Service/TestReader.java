package com.epamService.Service;

import java.util.ResourceBundle;

public class TestReader {
    private static ResourceBundle resourceBundle=ResourceBundle.getBundle(System.getProperty("env"));
    public static String getTestData(String key)
    {
        return resourceBundle.getString(key);
    }
}
