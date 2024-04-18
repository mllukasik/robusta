package com.mllukasik.robusta.util;

import java.util.Map;
import java.util.Set;

public final class Collections {

    private Collections() {
    }

    public static boolean isEmpty(Map<?, ?> value) {
        return value == null || value.isEmpty();
    }

    public static boolean isEmpty(Set<?> value) {
        return value == null || value.isEmpty();
    }

    public static boolean isNotEmpty(Map<?, ?> value) {
        return !isEmpty(value);
    }
}
