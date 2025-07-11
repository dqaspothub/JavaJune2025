package com.exception;

public class UncheckedExample {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // NullPointerException at runtime
    }
}
