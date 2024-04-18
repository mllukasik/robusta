package com.mllukasik.robusta.util;

public final class Strings {

    public static final String EMPTY = "";
    private static final int ONE = 1;

    private Strings() {
    }

    public static boolean isBlank(String value) {
        return value == null || value.isBlank();
    }

    public static boolean isNotBlank(String value) {
        return !isBlank(value);
    }

    public static boolean isEmpty(String value) {
        return value == null || value.isEmpty();
    }

    public static boolean isNotEmpty(String value) {
        return !isEmpty(value);
    }

    public static boolean allEqual(String... values) {
        if (values.length == ONE) {
            return true;
        }
        var firstValue = values[0];
        for (var i = 1; i < values.length; i++) {
            if (notEqual(firstValue, values[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean equal(String value1, String value2) {
        if (value1 == null && value2 == null) {
            return true;
        }
        return value1 != null && value1.equals(value2);
    }

    public static boolean notEqual(String value1, String value2) {
        return !equal(value1, value2);
    }
}
