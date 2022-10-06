package subjectoct4_123and4;

public class Employee1IT implements Employeee ,Runnable {

	public String nameOfEmployee1() {
		// TODO Auto-generated method stub
		return "Madhav";
	}

	public int EmployeeId1() {
		// TODO Auto-generated method stub
		return 2234;
	}

	public String nameOfEmployeeReporting1() {
		// TODO Auto-generated method stub
		return "Setu";
	}

	public int noOfEmployeeUnderHim1() {
		// TODO Auto-generated method stub
		return 7;
	}

	public String TaggedProject1() {
		// TODO Auto-generated method stub
		return "GCP";
	}

	public int noOfResoucesToThatProject1() {
		// TODO Auto-generated method stub
		return 6;
	}

	public int BudgetOfProject1() {
		// TODO Auto-generated method stub
		return 100000;
	}

	public String nameOftheProject1() {
		// TODO Auto-generated method stub
		return "GCP Cloud Application";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run() for Employee Interface 1");
	}

}
