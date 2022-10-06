package subjectoct4_123and4;

public class Employee8IT implements Employeee , Runnable{

	public String nameOfEmployee1() {
		// TODO Auto-generated method stub
		return "Trent";
	}

	public int EmployeeId1() {
		// TODO Auto-generated method stub
		return 8764;
	}

	public String nameOfEmployeeReporting1() {
		// TODO Auto-generated method stub
		return "Sheetal";
	}

	public int noOfEmployeeUnderHim1() {
		// TODO Auto-generated method stub
		return 8;
	}

	public String TaggedProject1() {
		// TODO Auto-generated method stub
		return "Java-Devlopment";
	}

	public int noOfResoucesToThatProject1() {
		// TODO Auto-generated method stub
		return 8;
	}

	public int BudgetOfProject1() {
		// TODO Auto-generated method stub
		return 1000000;
	}

	public String nameOftheProject1() {
		// TODO Auto-generated method stub
		return "Java-Devlopment";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run() for Employee Interface 8");
	}

}
