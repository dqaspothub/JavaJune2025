package com.java.constructor;

public class ThisKeyWord {

	String LaptopName;
	
	
	void setName(String LaptopName) {
		
		this.LaptopName = LaptopName;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyWord obj = new ThisKeyWord();
		obj.setName("HP");
		System.out.println(obj.LaptopName);
		
	}

}
