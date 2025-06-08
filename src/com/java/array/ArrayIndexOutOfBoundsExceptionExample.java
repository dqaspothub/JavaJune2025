package com.java.array;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String args[]){

		int number[]={1, 5, 7, 9, 11};
		
		int length = number.length;
		
		System.out.println("array length :"+length);
		
		
		for(int i=0;i<=number.length;i++){
			System.out.println(number[i]);
		}
	}
}


