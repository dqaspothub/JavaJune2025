package com.java.array;

public class ArraySum {
	
    public static void main(String[] args) {
    	
        int[] marks = {90, 85, 70, 95, 80};
        
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        System.out.println("Total Marks: " + sum);
    }
}
