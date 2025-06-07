package com.java.string;

public class LearningStringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "studytonight";

		char charvar = str.charAt(3);

		System.out.println(charvar);

		System.out.println(str.charAt(2));

		//NOTE: Index of a String starts from 0, hence str.charAt(2) means third character of the String str.

		String str1 = "jaVA";

		System.out.println(str1.equalsIgnoreCase("JAVA"));

		//     int indexOf(String str): It returns the index within this string of the first occurrence of the specified substring.
		//  int indexOf(int ch, int fromIndex): It returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
		//    int indexOf(int ch): It returns the index within this string of the first occurrence of the specified character.
		//     int indexOf(String str, int fromIndex): It returns the index within this string of the first occurrence of the specified substring, starting at the specified index.


		System.out.println(str.indexOf('t'));   //3rd form
		System.out.println(str.indexOf('t', 3));    //2nd form
		String subString="Ton";
		System.out.println(str.indexOf(subString)); //1st form
		System.out.println(str.indexOf(subString,7));   //4th form

		String str4 = "(0123456789)";
		System.out.println(str4.substring(4));
		System.out.println("The substring" + str4.substring(1,11));  


		int num = 35;
		String s1 = String.valueOf(num);    //converting int to String
		System.out.println(s1);
		System.out.println("type of num is: "+s1.getClass().getName()); 

		//NOTE: valueOf() function is used to convert primitive data types into Strings.
	}

}
