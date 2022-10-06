package subjectoct4_123and4;

public class Employee9 extends Employee implements Runnable{

	@Override
	public String nameOfEmployee() {
		// TODO Auto-generated method stub
		return "Abhinav";
	}

	@Override
	public int EmployeeId() {
		// TODO Auto-generated method stub
		return 6388;
	}

	@Override
	public String nameOfEmployeeReporting() {
		// TODO Auto-generated method stub
		return "Elon";
	}

	@Override
	public int noOfEmployeeUnderHim() {
		// TODO Auto-generated method stub
		return 9;
	}

	@Override
	public String TaggedProject() {
		// TODO Auto-generated method stub
		return "Data Managment";
	}

	@Override
	public int noOfResoucesToThatProject() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int BudgetOfProject() {
		// TODO Auto-generated method stub
		return 100000;
	}

	@Override
	public String nameOftheProject() {
		// TODO Auto-generated method stub
		return "Data Desingning";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method for Employee 9");
		
	}

	

}
