package com.java.array;

public class JaggedArrayDemo {

	public static void main(String args[]){

		int[][] marks = {
				{85, 90},      // Student 1 (2 subjects)  
				{78, 92, 88},  // Student 2 (3 subjects)  
				{95}           // Student 3 (1 subject)  
		};

		// Print all marks  
		for (int i = 0; i < marks.length; i++) { 

			System.out.print("Student " + (i+1) + ": "); 

			for (int j = 0; j < marks[i].length; j++) { 

				System.out.print(marks[i][j] + " ");  
			}  
			System.out.println();  
		}}}