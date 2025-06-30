package com.java.string;

public class StringSplitFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ip="Amazon development center Chennai";
		
		System.out.println(ip);

		String[] split = ip.split(" ");

		//{"amazon","development","center","chennai"}


		// Method 1
		for (int i = split.length-1; i>=0; i--) {

			System.out.println(split[i]+" ");

		}	

		for(int i=0;i<split.length;i++) {

			System.out.println(split[i]+" ");

		}

		//Method 2
		
		for (String str : split) {
			System.out.println(str + ", ");
		}
	
		

	}

}
