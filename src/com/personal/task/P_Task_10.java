package com.personal.task;

class Printer {
	public void print(String text) {
		System.out.println("Printing: " + text);
	}

	public void print(int number) {
		System.out.println("Printing number: " + number);
	}
}

class ColorPrinter extends Printer {
	@Override
	public void print(String text) {
		System.out.println("Printing in color: " + text);
	}
}

public class P_Task_10 {
	public static void main(String[] args) {
		Printer p1 = new Printer();
		ColorPrinter p2 = new ColorPrinter();

		p1.print("Hello");
		p1.print(123);

		p2.print("Hello Color");
		p2.print(456);  // inherited from Printer
	}
}
