package com.java.controlflow;

public class WhileLoopExample {

	public static void main(String[] args) {

		int tries = 1;
		boolean wantToPlayAgain = true;

		do {
		    System.out.println("Playing the game. Try #" + tries);
		    tries++;
		} while (wantToPlayAgain);


	}
}