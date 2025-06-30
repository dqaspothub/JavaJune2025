package com.inheritance.concepts;

//Parent class
class Animal {
 String type = "Animal";

 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Child class
class Dog extends Animal {
 void bark() {
     System.out.println("The dog barks.");
 }
}

//Main class
public class InheritanceExample {
 public static void main(String[] args) {
     Dog myDog = new Dog();

     // Access inherited method
     myDog.eat();  // Output: This animal eats food.

     // Access child class method
     myDog.bark(); // Output: The dog barks.

     // Access inherited variable
     System.out.println("Type: " + myDog.type); // Output: Type: Animal
 }
}
