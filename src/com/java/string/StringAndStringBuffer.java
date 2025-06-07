package com.java.string;

public class StringAndStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "study";
		str.concat("tonight");
		System.out.println(str);      // Output: study

		StringBuffer strB = new StringBuffer("study");
		strB.append("tonight");
		System.out.println(strB);    // Output: studytonight
	}
}