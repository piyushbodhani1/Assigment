package com.kpi.question3;

/**
 * @author PiyushBodhani
 *
 */
public class Organization {
	
	
	
	
	
	String nameOfCEO;
	String nameOfCOO;
	int marketcap;
	
	// CONSTRUCTORS BELOW
	
	// cons1
    Organization(){
	   	this.marketcap = 50000;
	}
    // cons2
	Organization(String nameOfCEO ){
		this.nameOfCEO = nameOfCEO;
	}
	// cons3
	Organization(String nameOfCEO , String nameOfCOO){
		this.nameOfCEO = nameOfCEO;
		this.nameOfCOO = nameOfCOO;
	}
	
    void displ()
	{
		System.out.println(nameOfCEO);
		System.out.println(nameOfCOO);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// object 1
		Organization o1 = new Organization("Chaterji","Mukherji");
		// object 2
		Organization o2 = new Organization("Chaterji" , "Bagga");
		// object 3
		Organization o3 = new Organization("gabba","Sing");
		// object 4
		Organization o4 = new Organization("iyer" , "GOGO");
		// object 5
		Organization o5 = new Organization("siiii" , "Nudela");
	     
		o1.displ();
		o2.displ();
		o3.displ();
		o4.displ();
		o5.displ();
   
        
	}

}
