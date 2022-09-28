package com.kpi.question1;

/**
 * @author PiyushBodhani
 *
 */
public class ExceptionHandeling {
	static int a = 5, b = 0;

	static int divide(int a, int b) {
		return a / b;
	}

	public static void main(String args[]) {
		try {
			ExceptionHandeling.divide(a, b);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} finally {
			System.out.print("Arthematic exception occured due to the bad input");
		}

	}
}
