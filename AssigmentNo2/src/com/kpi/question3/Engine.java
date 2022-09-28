package com.kpi.question3;

/**
 * @author PiyushBodhani
 *
 */
public class Engine extends Car {
	String Brand = "Ferrari";

	void disp() {
		System.out.println(Brand);
		System.out.println(super.Brand);
	}

	void maxSpeed() {
		System.out.println("450");
	}

	void speedDes() {
		super.maxSpeed();
		maxSpeed();
	}
}
