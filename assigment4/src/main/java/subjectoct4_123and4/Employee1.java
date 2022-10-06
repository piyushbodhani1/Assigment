package subjectoct4_123and4;

public class Employee1 extends Employee implements Runnable {

	@Override
	public String nameOfEmployee() {
		// TODO Auto-generated method stub
		return "Sachin";
	}

	@Override
	public int EmployeeId() {
		// TODO Auto-generated method stub
		return 1123;
	}

	@Override
	public String nameOfEmployeeReporting() {
		// TODO Auto-generated method stub
		return "Sarla";
	}

	@Override
	public int noOfEmployeeUnderHim() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String TaggedProject() {
		// TODO Auto-generated method stub
		return "AWS";
	}

	@Override
	public int noOfResoucesToThatProject() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public int BudgetOfProject() {
		// TODO Auto-generated method stub
		return 4440000;
	}

	@Override
	public String nameOftheProject() {
		// TODO Auto-generated method stub
		return "AWS Cloud Application";
	}

	

	public void run() {
		System.out.println(" executing run() method! for Employee1");
	}

}
