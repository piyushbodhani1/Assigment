package subjectoct4_123and4;

public class Employee7 extends Employee implements Runnable{

	@Override
	public String nameOfEmployee() {
		// TODO Auto-generated method stub
		return "Elon";
	}

	@Override
	public int EmployeeId() {
		// TODO Auto-generated method stub
		return 8732;
	}

	@Override
	public String nameOfEmployeeReporting() {
		// TODO Auto-generated method stub
		return "John";
	}

	@Override
	public int noOfEmployeeUnderHim() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public String TaggedProject() {
		// TODO Auto-generated method stub
		return "AI";
	}

	@Override
	public int noOfResoucesToThatProject() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int BudgetOfProject() {
		// TODO Auto-generated method stub
		return 3000000;
	}

	@Override
	public String nameOftheProject() {
		// TODO Auto-generated method stub
		return "AI Model";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run()  method for employee 7");
		
	}

	

}
