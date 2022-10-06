package subjectoct4_123and4;

public class Employee4 extends Employee implements Runnable{

	@Override
	public String nameOfEmployee() {
		// TODO Auto-generated method stub
		return "Neha";
	}

	@Override
	public int EmployeeId() {
		// TODO Auto-generated method stub
		return 9753;
	}

	@Override
	public	String nameOfEmployeeReporting() {
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
		return "IOT";
	}

	@Override
	public int noOfResoucesToThatProject() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public int BudgetOfProject() {
		// TODO Auto-generated method stub
		return 101010;
	}

	@Override
	public String nameOftheProject() {
		// TODO Auto-generated method stub
		return "IOT Apllication";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method() for employee 4");
		
	}

	

}
