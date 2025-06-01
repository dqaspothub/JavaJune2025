package com.java.operator;

public class LogicalOperatorsExample {
	
    public static void main(String[] args) {
    	
        int age = 5;
        boolean hasTicket = true;

        // AND Operator
        if (age >= 18 && hasTicket) {
            System.out.println("Allowed to enter the concert.");
        }

        // OR Operator
        boolean hasPass = false;
        if (hasTicket || hasPass) {
            System.out.println("Entry allowed with ticket or pass.");
        }

        // NOT Operator
        boolean isMember = false;
        if (!isMember) {
            System.out.println("Please register to become a member.");
        }
    }
}
