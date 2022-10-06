package subjectoct4_123and4;

public class Employee2 extends Employee implements Runnable{

	@Override
	public String nameOfEmployee() {
		// TODO Auto-generated method stub
		return "Madhu";
	}

	@Override
	public int EmployeeId() {
		// TODO Auto-generated method stub
		return 9876;
	}

	@Override
	public String nameOfEmployeeReporting() {
		// TODO Auto-generated method stub
		return "Rekha";
	}

	@Override
	public int noOfEmployeeUnderHim() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public String TaggedProject() {
		// TODO Auto-generated method stub
		return "Snowflake";
	}

	@Override
	public int noOfResoucesToThatProject() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int BudgetOfProject() {
		// TODO Auto-generated method stub
		return 10101010;
	}

	@Override
	public String nameOftheProject() {
		// TODO Auto-generated method stub
		return "An Applcation";
	}

	public void run() {
		System.out.println(" executing run() method! for Employee 2");
	}
}
