package com.newcontructor.java;

//Class definition
public class Car {

 // Instance variables
 String brand;
 int year;

 // Default constructor (created automatically if none defined)
 public Car() {
     System.out.println("Default constructor called");
     brand = "Toyota";
     year = 2020;
 }

 // Parameterized constructor
 public Car(String b, int y) {
     System.out.println("Parameterized constructor called");
     brand = b;
     year = y;
 }

 // Method to display car details
 public void displayDetails() {
     System.out.println("Brand: " + brand + ", Year: " + year);
 }

 // Main method
 public static void main(String[] args) {
     // Using default constructor
     Car car1 = new Car();         // Calls default constructor
     car1.displayDetails();        // Output: Toyota, 2020

     // Using parameterized constructor
     Car car2 = new Car("BMW", 2023);  // Calls parameterized constructor
     car2.displayDetails();            // Output: BMW, 2023
 }
}
