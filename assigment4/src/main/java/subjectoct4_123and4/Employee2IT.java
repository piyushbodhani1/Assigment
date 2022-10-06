package subjectoct4_123and4;

public class Employee2IT implements Employeee,Runnable {

	public String nameOfEmployee1() {
		// TODO Auto-generated method stub
		return "Rehan";
	}

	public int EmployeeId1() {
		// TODO Auto-generated method stub
		return 6677;
	}

	public String nameOfEmployeeReporting1() {
		// TODO Auto-generated method stub
		return "Setu";
	}

	public int noOfEmployeeUnderHim1() {
		// TODO Auto-generated method stub
		return 8;
	}

	public String TaggedProject1() {
		// TODO Auto-generated method stub
		return "Managment";
	}

	public int noOfResoucesToThatProject1() {
		// TODO Auto-generated method stub
		return 100;
	}

	public int BudgetOfProject1() {
		// TODO Auto-generated method stub
		return 10000;
	}

	public String nameOftheProject1() {
		// TODO Auto-generated method stub
		return "Managment OF Group";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run() for Employee Interface 2");
	}

}
