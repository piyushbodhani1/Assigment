package subjectoct4_123and4;

public class Employee4IT implements Employeee , Runnable{

	public String nameOfEmployee1() {
		// TODO Auto-generated method stub
		return "Madhav";
	}

	public int EmployeeId1() {
		// TODO Auto-generated method stub
		return 1000;
	}

	public String nameOfEmployeeReporting1() {
		// TODO Auto-generated method stub
		return "Surekha";
	}

	public int noOfEmployeeUnderHim1() {
		// TODO Auto-generated method stub
		return 8;
	}

	public String TaggedProject1() {
		// TODO Auto-generated method stub
		return "DBMS";
	}

	public int noOfResoucesToThatProject1() {
		// TODO Auto-generated method stub
		return 1000;
	}

	public int BudgetOfProject1() {
		// TODO Auto-generated method stub
		return 101010;
	}

	public String nameOftheProject1() {
		// TODO Auto-generated method stub
		return "DBA";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run() for Employee Interface 4");
	}

}
