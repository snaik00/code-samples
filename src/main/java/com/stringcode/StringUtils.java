package com.stringcode;

public class StringUtils {

    public static boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static String toUpper(String value) {
        if (value == null) {
            return null;
        }
        return value.toUpperCase();
    }
}
