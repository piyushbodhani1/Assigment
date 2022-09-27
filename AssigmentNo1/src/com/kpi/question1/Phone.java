package com.kpi.question1;


/**
 * @author PiyushBodhani
 *
 */
public class Phone implements Camera , Battery , Software {

	@Override
	public String NameOfSoftware() {
		// TODO Auto-generated method stub
		return "Kitkat";
	}

	@Override
	public float versionofsoftware() {
		// TODO Auto-generated method stub
		return (float)7.7;
	}

	@Override
	public String CompanyOfSoftware() {
		// TODO Auto-generated method stub
		return "Google/Android";
	}

	@Override
	public int batteryMAH() {
		// TODO Auto-generated method stub
		return 4000;
	}

	@Override
	public String batteryQuality() {
		// TODO Auto-generated method stub
		return "Good";
	}

	@Override
	public String BatterCompany() {
		// TODO Auto-generated method stub
		return "samsung";
	}

	@Override
	public int megapixel() {
		// TODO Auto-generated method stub
		return 41;
	}

	@Override
	public String camerabrand() {
		// TODO Auto-generated method stub
		return "Sony";
	}

	@Override
	public int noofcameras() {
		// TODO Auto-generated method stub
		return 1;
	}
	public String  nameOfPhone()
	{
		return "Pixel 4";
	}
    public static void main(String args[])
    {
    	Phone p = new Phone();
    	System.out.println("Name of the phone:-"+p.nameOfPhone());
    	System.out.println("Camera Megapixel:-"+p.megapixel());
    	System.out.println("No of camera:-"+p.noofcameras());
    	System.out.println("Brand of Camera:-"+p.camerabrand());
    	System.out.println("MAH of battery:-"+p.batteryMAH());
    	System.out.println("Company of battery:-"+p.BatterCompany());
    	System.out.println("Quality of battery:-"+p.batteryQuality());
    	System.out.println("Name of the software:-"+p.NameOfSoftware());
    	System.out.println("version of software:-"+p.versionofsoftware());
    	System.out.println("Company of software:-"+p.CompanyOfSoftware());
    	
    }
}
