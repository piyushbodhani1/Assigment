package subjectoct4_123and4;

public class Employee6 extends Employee implements Runnable{

	@Override
	public String nameOfEmployee() {
		// TODO Auto-generated method stub
		return "Suresh";
	}

	@Override
	public int EmployeeId() {
		// TODO Auto-generated method stub
		return 1278;
	}

	@Override
	public String nameOfEmployeeReporting() {
		// TODO Auto-generated method stub
		return "Sarla";
	}

	@Override
	public int noOfEmployeeUnderHim() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public String TaggedProject() {
		// TODO Auto-generated method stub
		return "Oracle";
	}

	@Override
	public int noOfResoucesToThatProject() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public int BudgetOfProject() {
		// TODO Auto-generated method stub
		return 200000;
	}

	@Override
	public String nameOftheProject() {
		// TODO Auto-generated method stub
		return "Oracle Application";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method() for Employee 6");
		
	}

	

}
