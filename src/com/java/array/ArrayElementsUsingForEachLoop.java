package com.java.array;

public class ArrayElementsUsingForEachLoop {
	
	public static void main(String args[]){

		//String array
		String names[]={"Chaitanya", "Ajeet", "Rahul", "Hari"};

		//print array elements using for-each loop
		for(String str:names) 
			System.out.println(str);

	
		//int array
		int numbers[]={1, 2, 3, 4, 5};

		//print array elements using for-each loop
		for(int num:numbers)
			System.out.println(num);
	}
}
