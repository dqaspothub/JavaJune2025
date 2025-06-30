package com.inheritance.concepts;

interface A {
    void show();
}

interface B {
    void display();
}

interface C extends A, B {
    void hello();
}

class D implements C {
    public void show() {
        System.out.println("From A");
    }

    public void display() {
        System.out.println("From B");
    }

    public void hello() {
        System.out.println("From C");
    }
}

public class HybridInheritanceExample {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
        obj.display();
        obj.hello();
    }
}
