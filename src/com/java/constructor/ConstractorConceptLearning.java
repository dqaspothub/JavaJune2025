package com.java.constructor;

public class ConstractorConceptLearning {

	int a ;

	ConstractorConceptLearning(){

		System.out.println("Hi am constructor");
	}

	ConstractorConceptLearning(int b){

		System.out.println("Hi am param constructor");
		System.out.println(b);

	}

	ConstractorConceptLearning(String name,int age){

		System.out.println("Hi am param constructor");
		System.out.println(name);
		System.out.println(age);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstractorConceptLearning constractorConceptLearning2 = new ConstractorConceptLearning("kanna",29);
		ConstractorConceptLearning constractorConceptLearning1 = new ConstractorConceptLearning(10);
		ConstractorConceptLearning constractorConceptLearning = new ConstractorConceptLearning();

		System.out.println(constractorConceptLearning.a);

	}

}
