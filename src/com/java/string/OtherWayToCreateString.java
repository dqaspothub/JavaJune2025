package com.java.string;

public class OtherWayToCreateString {

	public static void main(String[] args) {
		// String (Immutable)
		String str = "Hello";
		str += " World";  // Creates a new object

		// StringBuilder (Mutable & Faster)
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");  // Modifies same object

		// StringBuffer (Thread-safe)
		StringBuffer sbf = new StringBuffer("Hello");
		sbf.append(" World");  // Thread-safe modification
	}

}
