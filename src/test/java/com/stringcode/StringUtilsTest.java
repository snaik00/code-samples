package com.stringcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isEmpty() {
        assertTrue(StringUtils.isEmpty(null));
    }

    @Test
    void isEmptyCheck() {
        assertTrue(StringUtils.isEmpty(" "));
    }

    @Test
    void nonEmptyStringShouldNotBeEmpty() {
        assertFalse(StringUtils.isEmpty("hello"));
    }

    @Test
    void toUpperShouldConvertText() {
        assertEquals("JAVA", StringUtils.toUpper("java"));
    }

    @Test
    void toUpperWithNullShouldReturnNull() {
        assertNull(StringUtils.toUpper(null));
    }
}