
package com.stringcode;

public class StringCode {

    public static void main(String[] args) {

        String text = "hello world";

        System.out.println("Is empty: " + StringUtils.isEmpty(text));
        System.out.println("Uppercase: " + StringUtils.toUpper(text));
    }
}
