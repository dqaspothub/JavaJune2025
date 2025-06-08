package com.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodsDemo {

	public static void main(String[] args) {
		int[] numbers = { 5, 2, 9, 1, 5, 6 };

		// 1. Convert Array to String
		System.out.println("1. Array to String: " + Arrays.toString(numbers));

		// 2. Sort the Array
		Arrays.sort(numbers);
		System.out.println("2. After Sorting: " + Arrays.toString(numbers));

		// 3. Binary Search (Works only on sorted arrays)
		int key = 5;
		int index = Arrays.binarySearch(numbers, key);
		System.out.println("3. Index of " + key + ": " + index);

		// 4. Fill Array with a Value
		int[] filledArray = new int[5];
		Arrays.fill(filledArray, 10);
		System.out.println("4. Filled Array: " + Arrays.toString(filledArray));

		// 5. Copy an Array
		int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
		System.out.println("5. Copied Array: " + Arrays.toString(copiedArray));

		// 6. Copy a Range of Elements
		int[] rangeArray = Arrays.copyOfRange(numbers, 1, 4);
		System.out.println("6. Sub-Array (Index 1-3): " + Arrays.toString(rangeArray));

		// 7. Check if Two Arrays are Equal
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		boolean areEqual = Arrays.equals(arr1, arr2);
		System.out.println("7. Are arr1 and arr2 equal? " + areEqual);

	}



}
