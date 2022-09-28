package com.kpi.question2;

/**
 * @author PiyushBodhani
 *
 */
public interface Animal {
	int type();

	String name();

	default String nameOfAnimalsSon() {
		return "SON";
	}

	static void NoofGrp() {
		System.out.print("99");
	}
}
