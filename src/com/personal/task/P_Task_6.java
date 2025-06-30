package com.personal.task;

public class P_Task_6 {

	public static void main(String[] args) {
		String str = "hello";
		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);  // Concatenates characters in reverse
		}

		System.out.println(reversed);  // "olleh"
	
}

}
