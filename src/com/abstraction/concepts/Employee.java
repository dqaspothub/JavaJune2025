package com.abstraction.concepts;

public abstract class Employee {
 
    String name;
    double salary;

    Employee(String name) {
        this.name = name;
    }

    // Concrete method
    void showDetails() {
        System.out.println("Employee: " + name);
    }

    // Abstract method — must be implemented by subclasses
    abstract void calculateSalary();
}

