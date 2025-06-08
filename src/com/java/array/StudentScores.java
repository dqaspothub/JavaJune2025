package com.java.array;

public class StudentScores {
	public static void main(String[] args) {
		int[] scores = {85, 90, 78, 88, 95};
		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];  // Add each score to the total sum
		}

		double average = sum / (double) scores.length;
		System.out.println("Average Score: " + average);
	}
}

