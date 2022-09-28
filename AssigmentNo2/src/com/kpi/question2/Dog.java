package com.kpi.question2;

/**
 * @author PiyushBodhani
 *
 */
public class Dog implements Animal {

	@Override
	public int type() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Dog";
	}

	public static void main(String args[]) {
		Dog d = new Dog();
		System.out.println(d.type());
		System.out.println(d.name());

	}
}
