package com.java.string;

public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");        // Hello World
		sb.insert(5, ",");          // Hello, World
		sb.replace(6, 11, "Java");  // Hello, Java
		sb.delete(5, 7);            // HelloJava
		sb.reverse();               // avaJolleH

		System.out.println(sb.toString());
	}

}


/*StringBuilder jsonBuilder = new StringBuilder();
jsonBuilder.append("{")
.append("\"name\": \"John\",")
.append("\"age\": 30")
.append("}");

String json = jsonBuilder.toString();*/