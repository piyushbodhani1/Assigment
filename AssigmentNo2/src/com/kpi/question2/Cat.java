package com.kpi.question2;

/**
 * @author PiyushBodhani
 *
 */
public class Cat implements Animal {

	@Override
	public int type() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Cat";
	}

	public static void main(String args[]) {
		Cat c = new Cat();
		System.out.println(c.type());
		System.out.println(c.name());
	}
}
