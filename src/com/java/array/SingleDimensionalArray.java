package com.java.array;

public class SingleDimensionalArray {
	public static void main(String args[]){
		//array declaration
		String names[] = new String[5];

		//array initialization
		names[0]="Chaitanya";
		names[1]="Ajeet";
		names[2]="Rahul";
		names[3]="Shivam";
		names[4]="Rohit";

		//print array elements
		for(int i=0;i<names.length;i++)
			System.out.println("names["+i+"]: "+names[i]);
	}
}
