package subjectoct4_123and4;

public class Employee3IT implements Employeee , Runnable{

	public String nameOfEmployee1() {
		// TODO Auto-generated method stub
		return "Surekha";
	}

	public int EmployeeId1() {
		// TODO Auto-generated method stub
		return 1107;
	}

	public String nameOfEmployeeReporting1() {
		// TODO Auto-generated method stub
		return "Geeta";
	}

	public int noOfEmployeeUnderHim1() {
		// TODO Auto-generated method stub
		return 8;
	}

	public String TaggedProject1() {
		// TODO Auto-generated method stub
		return "Dbms";
	}

	public int noOfResoucesToThatProject1() {
		// TODO Auto-generated method stub
		return 8;
	}

	public int BudgetOfProject1() {
		// TODO Auto-generated method stub
		return 100000;
	}

	public String nameOftheProject1() {
		// TODO Auto-generated method stub
		return "DBMS Managment";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run() for Employee Interface 3");
	}

}
