package com.newcontructor.java;

public class DefaultConstructor {

    String model;
    
    public static void main(String[] args) {
    	DefaultConstructor defaultConstructor = new DefaultConstructor(); // Default constructor called
        System.out.println(defaultConstructor.model); // null (default value)
    }
}