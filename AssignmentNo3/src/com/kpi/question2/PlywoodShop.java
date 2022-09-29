package com.kpi.question2;
//Program to Define abstraction

/**
 * @author ManoharBodhani
 *
 */
public class PlywoodShop extends Furniture {

	@Override
	int NoOfTypes() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	String nameOfTheType() {
		// TODO Auto-generated method stub
		return "Tabel&Chair";
	}

	@Override
	String Quality() {
		// TODO Auto-generated method stub
		return "Best int the market";
	}

	@Override
	int Quantity() {
		// TODO Auto-generated method stub
		return 5;
	}

	public static void main(String args[]) {
		PlywoodShop p = new PlywoodShop();
		System.out.println(p.nameOfTheType());
		System.out.println(p.NoOfTypes());
		System.out.println(p.Quality());
		System.out.println(p.Quantity());
	}
}
