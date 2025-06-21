package com.java.constructor.example;

class Animal {
	Animal(){

		System.out.println("Animal");
	}

}

class Dog extends Animal{

	Dog(){

		System.out.println("Dog");
	}
}
public class MainClass
{


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
	}

}