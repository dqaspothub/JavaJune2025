package com.java.string;

import java.util.Arrays;
import java.util.List;

public class StringJoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"Alice", "Bob", "Charlie"};
		String result = String.join(", ", names);
		System.out.println(result); // Output: Alice, Bob, Charlie
	
		List<String> cities = Arrays.asList("New York", "London", "Tokyo");
        String result1 = String.join(" | ", cities);
        System.out.println(result1); // Output: New York | London | Tokyo
	
        String result2 = String.join("-", "2025", "06", "06");
        System.out.println(result2); // Output: 2025-06-06
	
        //String csv = name1 + "," + name2 + "," + name3;
        //String csv = String.join(",", name1, name2, name3);

	}

}


