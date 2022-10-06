package testoct4123and4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import subjectoct4_123and4.Employee1IT;
import subjectoct4_123and4.Employee2IT;

public class EmployeeITTest {
	@Test
	public void testans() {
		// ET1
		Employee1IT t1 = new Employee1IT();
		// 1
		String name1 = t1.nameOfEmployee1();
		assertEquals("Madhav", name1);
		System.out.println("Name of employee:-" + name1);
		// 2
		int id1 = t1.EmployeeId1();
		assertEquals(2234, id1);
		System.out.println("Employee ID:-" + id1);
		// 3
		String nameofreporting = t1.nameOfEmployeeReporting1();
		assertEquals("Setu", nameofreporting);
		System.out.println("Name Of Employee Reporting:-" + nameofreporting);
		// 4
		int under1 = t1.noOfEmployeeUnderHim1();
		assertEquals(7, under1);
		System.out.println("Employes under him:-" + under1);
		// 5
		String tagged = t1.TaggedProject1();
		assertEquals("GCP", tagged);
		System.out.println("tagged Project:-" + tagged);
		// 6
		int res1 = t1.noOfResoucesToThatProject1();
		assertEquals(6, res1);
		System.out.println("Resources to Project:-" + res1);
		// 7
		int budget1 = t1.BudgetOfProject1();
		assertEquals(100000, budget1);
		System.out.println("Budget Of the project:-" + budget1);
		// 8
		String Proname1 = t1.nameOftheProject1();
		assertEquals("GCP Cloud Application", Proname1);
		System.out.println("Name of the project:-" + Proname1);

		Thread t11 = new Thread(new Employee1IT());
		t11.start();
		
		
		System.out.println();

		// ET1
		Employee2IT t2 = new Employee2IT();
		// 1
		String name2 = t2.nameOfEmployee1();
		assertEquals("Rehan", name2);
		System.out.println("Name of employee:-" + name2);
		// 2
		int id2 = t2.EmployeeId1();
		assertEquals(6677, id2);
		System.out.println("Employee ID:-" + id2);
		// 3
		String nameofreporting2 = t2.nameOfEmployeeReporting1();
		assertEquals("Setu", nameofreporting2);
		System.out.println("Name Of Employee Reporting:-" + nameofreporting2);
		// 4
		int under2 = t2.noOfEmployeeUnderHim1();
		assertEquals(8, under2);
		System.out.println("Employes under him:-" + under2);
		// 5
		String tagged2 = t2.TaggedProject1();
		assertEquals("Managment", tagged2);
		System.out.println("tagged Project:-" + tagged2);
		// 6
		int res2 = t2.noOfResoucesToThatProject1();
		assertEquals(100, res2);
		System.out.println("Resources to Project:-" + res2);
		// 7
		int budget2 = t2.BudgetOfProject1();
		assertEquals(10000, budget2);
		System.out.println("Budget Of the project:-" + budget2);
		// 8
		String Proname2 = t2.nameOftheProject1();
		assertEquals("Managment OF Group", Proname2);
		System.out.println("Name of the project:-" + Proname2);

		Thread t111 = new Thread(new Employee1IT());
		t111.start();
	}
}
