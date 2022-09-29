package com.kpi.question1;

/**
 * @author PiyushBodhani
 *  Code For Method Overloading
 */
public class ExecutingMethodOverloading {

	// firstName
	void name(String firstName) {
		System.out.println(firstName);
	}

	// first name with last name
	void name(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}

	// name with first name middle name last name
	void name(String firstName, String middleName, String lastName) {
		System.out.println(firstName + " " + middleName + " " + lastName);
	}

	public static void main(String args[]) {
		ExecutingMethodOverloading m = new ExecutingMethodOverloading();
		// calling method 1
		m.name("Piyush");
		m.name("Piyush", "Bodhani");
		m.name("Piyush", "Manohar", "Bodhani");

	}
}
