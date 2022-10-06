package subjectoct4_123and4;

public class Employee8 extends Employee implements Runnable {

	@Override
	public String nameOfEmployee() {
		// TODO Auto-generated method stub
		return "Shivam";
	}

	@Override
	public int EmployeeId() {
		// TODO Auto-generated method stub
		return 9613;
	}

	@Override
	public String nameOfEmployeeReporting() {
		// TODO Auto-generated method stub
		return "Elon";
	}

	@Override
	public int noOfEmployeeUnderHim() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public String TaggedProject() {
		// TODO Auto-generated method stub
		return "ML";
	}

	@Override
	public int noOfResoucesToThatProject() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int BudgetOfProject() {
		// TODO Auto-generated method stub
		return 300000;
	}

	@Override
	public String nameOftheProject() {
		// TODO Auto-generated method stub
		return "ML Application";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method() for Employee8");
		
	}

	

}
