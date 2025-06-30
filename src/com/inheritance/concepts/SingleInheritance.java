package com.inheritance.concepts;

class Animall {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dogg extends Animall {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dogg d = new Dogg();
        d.eat();   // Inherited from Animal
        d.bark();  // Defined in Dog
    }
}

