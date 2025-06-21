package com.java.constructor;

public class ThisKeywordDemo {

	int age;
	
	ThisKeywordDemo(int age){
		this.age = age;
	}

	public static void main(String[] args) {
		ThisKeywordDemo obj = new ThisKeywordDemo(8);
		System.out.println("obj.age = " + obj.age);
	}
}
