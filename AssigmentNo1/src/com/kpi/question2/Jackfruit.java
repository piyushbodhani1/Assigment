package com.kpi.question2;


/**
 * @author PiyushBodhani
 *
 */
public class Jackfruit extends Fruits {

	String Name;
	float weight;
	
	public String getName() {
		return "Suresh";
	}

	public void setName(String name) {
		Name = name;
	}

	public float getWeight() {
		return (float)8.9;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	String color() {
		// TODO Auto-generated method stub
		return "Yello";
	}

	@Override
	int price() {
		// TODO Auto-generated method stub
		return 50;
	}

	
   
public static void main(String args[])
   {
	   
	   
	   
	   
	/**
	 * @param args
	 * we can't create an object of the abstract class 
	 * because we don't have to use the methods in the abstract 
	 * class we have to use the overridden method of the concrete class 
	 * So we can't instantiate the object of the abstract class
	 * example 
	 * | | | 
	 * v v v
	 * Fruits f = new Fruits(); is not valid in java 
	 * hence we can't create an object of an abstract class
	 * 
	 */ 
	   Jackfruit m = new Jackfruit();
	   System.out.println(m.color());
	   System.out.println(m.price());
	   System.out.println(m.getName());
	   System.out.println(m.getWeight());
   }
}
