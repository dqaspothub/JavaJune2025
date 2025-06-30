package com.inheritance.concepts;

interface A1 {
    void show();
}

interface B1 {
    void display();
}

class C1 implements A1, B1 {
    public void show() {
        System.out.println("Show from A");
    }

    public void display() {
        System.out.println("Display from B");
    }
}

public class MultipleInheritanceViaInterface {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.show();
        obj.display();
    }
}
