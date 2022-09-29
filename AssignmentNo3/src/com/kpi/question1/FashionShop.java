package com.kpi.question1;
//code for method overriding

/**
 * @author PiyushBodhani
 *
 */
public class FashionShop extends Shop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FashionShop fs = new FashionShop();
		System.out.println(fs.interior());
		System.out.println(fs.varity());
		System.out.println(fs.Fashion());
		fs.income(100000);

	}

	@Override
	String interior() {
		// TODO Auto-generated method stub
		return "Fantastic";
	}

	@Override
	int varity() {
		// TODO Auto-generated method stub
		return 89;
	}

	@Override
	String Fashion() {
		// TODO Auto-generated method stub
		return "MensFashion";
	}
	void income(int number)
	{
		System.out.println(number);
	}

}
