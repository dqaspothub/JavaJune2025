package com.exception;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 10;  // ArrayIndexOutOfBoundsException

            String s = null;
            System.out.println(s.length());  // NullPointerException

        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}
