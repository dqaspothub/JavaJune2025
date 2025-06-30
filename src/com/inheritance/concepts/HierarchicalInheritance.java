package com.inheritance.concepts;

class Animals {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animals {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.eat(); d.bark();

        Cat c = new Cat();
        c.eat(); c.meow();
    }
}
