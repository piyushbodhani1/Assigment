package subjectoct4_123and4;

public class Employee10 extends Employee implements Runnable{

	@Override
	public String nameOfEmployee() {
		// TODO Auto-generated method stub
		return "Shewta";
	}

	@Override
	public int EmployeeId() {
		// TODO Auto-generated method stub
		return 6167;
	}

	@Override
	public String nameOfEmployeeReporting() {
		// TODO Auto-generated method stub
		return "Elon";
	}

	@Override
	public int noOfEmployeeUnderHim() {
		// TODO Auto-generated method stub
		return 9999;
	}

	@Override
	public String TaggedProject() {
		// TODO Auto-generated method stub
		return "System Managment";
	}

	@Override
	public int noOfResoucesToThatProject() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int BudgetOfProject() {
		// TODO Auto-generated method stub
		return 400000;
	}

	@Override
	public String nameOftheProject() {
		// TODO Auto-generated method stub
		return "System Desing & Managment";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method  for Employee 10");
	}

	
}
