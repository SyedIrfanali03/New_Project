package org.sample; //package

public class Project { // class

	private void task1() {// method

		System.out.println("My name : Demo code "); // business logic
		System.out.println("My address : no 12 smartkills Tech");

	}

	private void task2() {

		System.out.println("Demo started");
		System.out.println("Demo End");
		
		System.out.println("Hir am aravind here");

	}

	public static void main(String[] args) {// main method

		// Classname objrefname=new Classname();
		
		Project p = new Project();   //object 

		p.task1();//to call method
		p.task2();
		
		
	}

}
