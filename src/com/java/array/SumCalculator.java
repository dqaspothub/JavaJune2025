package com.java.array;

public class SumCalculator {  
	
	public static int calculateSum(int[] arr) {  
		
		int sum = 0;  
		for (int num : arr) {  
			sum += num;  
		}  
		return sum;  
	}  

	public static void main(String[] args) {  
		// Passing an anonymous array  
		
		int total = calculateSum(new int[] {5, 10, 15, 20});  
		System.out.println("Sum: " + total);  
	}  
}