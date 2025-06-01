package com.java.operator;

public class AssignmentOperator {

	public static void main(String[] args) {

		int a = 10;
		
        a += 5;   // a = a + 5 → 15
        System.out.println("a += 5 → " + a);

        a -= 3;   // a = a - 3 → 12
        System.out.println("a -= 3 → " + a);

        a *= 2;   // a = a * 2 → 24
        System.out.println("a *= 2 → " + a);

        a /= 4;   // a = a / 4 → 6
        System.out.println("a /= 4 → " + a);

        a %= 5;   // a = a % 5 → 1
        System.out.println("a %= 5 → " + a);
	}

}
