package subjectoct4_123and4;

public class Employee5 extends Employee implements Runnable {

	@Override
	public String nameOfEmployee() {
		// TODO Auto-generated method stub
		return "harun";
	}

	@Override
	public int EmployeeId() {
		// TODO Auto-generated method stub
		return 9567;
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
		return "Android Application";
	}

	@Override
	public int noOfResoucesToThatProject() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public int BudgetOfProject() {
		// TODO Auto-generated method stub
		return 9763300;
	}

	@Override
	public String nameOftheProject() {
		// TODO Auto-generated method stub
		return "Android Apllication";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method() for Employee 5");
	}

	

}
