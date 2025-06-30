package com.inheritance.concepts;

class Animalll {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Doggg extends Animalll {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Doggg {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // From Animal
        p.bark();  // From Dog
        p.weep();  // From Puppy
    }
}

