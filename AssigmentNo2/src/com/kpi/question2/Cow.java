package com.kpi.question2;

/**
 * @author PiyushBodhani
 *
 */
public class Cow implements Animal {

	@Override
	public int type() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Cow";
	}

	public static void main(String args[]) {
		Cow c = new Cow();
		System.out.println(c.type());
		System.out.println(c.name());
	}

}
