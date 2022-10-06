package testoct4123and4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import subjectoct4_123and4.Employee1;
import subjectoct4_123and4.Employee10;
import subjectoct4_123and4.Employee2;
import subjectoct4_123and4.Employee3;
import subjectoct4_123and4.Employee4;
import subjectoct4_123and4.Employee5;
import subjectoct4_123and4.Employee6;
import subjectoct4_123and4.Employee7;
import subjectoct4_123and4.Employee8;
import subjectoct4_123and4.Employee9;

public class EmployeeTest {
	@Test
	public void testanswer() {

		// For Class 1
		Employee1 t1 = new Employee1();
		// 1
		String name = t1.nameOfEmployee();
		assertEquals("Sachin", name);
		System.out.println("Name Of The Employee:-" + name);
		// 2
		int id = t1.EmployeeId();
		assertEquals(1123, id);
		System.out.println("Employee ID:-" + id);
		// 3
		String s1 = t1.nameOfEmployeeReporting();
		assertEquals("Sarla", s1);
		System.out.println("Employee Reports To:-" + s1);
		// 4
		int under = t1.noOfEmployeeUnderHim();
		assertEquals(5, under);
		System.out.println("No Of Employee under current Employee:-" + under);
		// 5
		int res = t1.noOfResoucesToThatProject();
		assertEquals(6, res);
		System.out.println("Resources alloted to the project:-" + res);
		// 6
		String tagged = t1.TaggedProject();
		assertEquals("AWS", tagged);
		System.out.println("Tagged Project:-" + tagged);
		// 7
		int budget = t1.BudgetOfProject();
		assertEquals(4440000, budget);
		System.out.println("Budget Of the Project:-" + budget);
		// 8
		String ProName = t1.nameOftheProject();
		assertEquals("AWS Cloud Application", ProName);
		System.out.println("Name Of the Project:-" + ProName);

		System.out.println("Main thread is- ");
		Thread t11 = new Thread(new Employee1());
		t11.start();

		System.out.println();

		// For Class 2
		Employee2 t2 = new Employee2();
		// 1
		String name2 = t2.nameOfEmployee();
		assertEquals("Madhu", name2);
		System.out.println("Name Of The Employee:-" + name2);
		// 2
		int id2 = t2.EmployeeId();
		assertEquals(9876, id2);
		System.out.println("Employee ID:-" + id2);
		// 3
		String s2 = t2.nameOfEmployeeReporting();
		assertEquals("Rekha", s2);
		System.out.println("Employee Reports To:-" + s2);
		// 4
		int under2 = t2.noOfEmployeeUnderHim();
		assertEquals(8, under2);
		System.out.println("No Of Employee under current Employee:-" + under2);
		// 5
		int res2 = t2.noOfResoucesToThatProject();
		assertEquals(10, res2);
		System.out.println("Resources alloted to the project:-" + res2);
		// 6
		String tagged2 = t2.TaggedProject();
		assertEquals("Snowflake", tagged2);
		System.out.println("Tagged Project:-" + tagged2);
		// 7
		int budget2 = t2.BudgetOfProject();
		assertEquals(10101010, budget2);
		System.out.println("Budget Of the Project:-" + budget2);
		// 8
		String ProName2 = t2.nameOftheProject();
		assertEquals("An Applcation", ProName2);
		System.out.println("Name Of the Project:-" + ProName2);

		System.out.println("Main thread is- " + Thread.currentThread().getName());
		Thread t12 = new Thread(new Employee2());
		t12.start();
		
		
		
		System.out.println();

		// For Class 3
		Employee3 t3 = new Employee3();
		// 1
		String name3 = t3.nameOfEmployee();
		assertEquals("Abhijeet", name3);
		System.out.println("Name Of The Employee:-" + name3);
		// 2
		int id3 = t3.EmployeeId();
		assertEquals(9191, id3);
		System.out.println("Employee ID:-" + id3);
		// 3
		String s3 = t3.nameOfEmployeeReporting();
		assertEquals("Rekha", s3);
		System.out.println("Employee Reports To:-" + s3);
		// 4
		int under3 = t3.noOfEmployeeUnderHim();
		assertEquals(6, under3);
		System.out.println("No Of Employee under current Employee:-" + under3);
		// 5
		int res3 = t3.noOfResoucesToThatProject();
		assertEquals(6, res3);
		System.out.println("Resources alloted to the project:-" + res3);
		// 6
		String tagged3 = t3.TaggedProject();
		assertEquals("IOT", tagged3);
		System.out.println("Tagged Project:-" + tagged3);
		// 7
		int budget3 = t3.BudgetOfProject();
		assertEquals(2020000, budget3);
		System.out.println("Budget Of the Project:-" + budget3);
		// 8
		String ProName3 = t3.nameOftheProject();
		assertEquals("IOT Application", ProName3);
		System.out.println("Name Of the Project:-" + ProName3);

		System.out.println("Main thread is- " + Thread.currentThread().getName());
		Thread t121 = new Thread(new Employee3());
		t121.start();
		
		
		
		
		System.out.println();

		// For Class 4
		Employee4 t4 = new Employee4();
		// 1
		String name4 = t4.nameOfEmployee();
		assertEquals("Neha", name4);
		System.out.println("Name Of The Employee:-" + name4);
		// 2
		int id4 = t4.EmployeeId();
		assertEquals(9753, id4);
		System.out.println("Employee ID:-" + id4);
		// 3
		String s4 = t4.nameOfEmployeeReporting();
		assertEquals("Rekha", s4);
		System.out.println("Employee Reports To:-" + s4);
		// 4
		int under4 = t4.noOfEmployeeUnderHim();
		assertEquals(8, under4);
		System.out.println("No Of Employee under current Employee:-" + under4);
		// 5
		int res4 = t4.noOfResoucesToThatProject();
		assertEquals(6, res4);
		System.out.println("Resources alloted to the project:-" + res4);
		// 6
		String tagged4 = t4.TaggedProject();
		assertEquals("IOT", tagged4);
		System.out.println("Tagged Project:-" + tagged4);
		// 7
		int budget4 = t4.BudgetOfProject();
		assertEquals(101010, budget4);
		System.out.println("Budget Of the Project:-" + budget4);
		// 8
		String ProName4 = t4.nameOftheProject();
		assertEquals("IOT Apllication", ProName4);
		System.out.println("Name Of the Project:-" + ProName4);

		System.out.println("Main thread is- " + Thread.currentThread().getName());
		Thread t1211 = new Thread(new Employee3());
		t1211.start();
		
		
		System.out.println();

		// For Class 5
		Employee5 t5 = new Employee5();
		// 1
		String name5 = t5.nameOfEmployee();
		assertEquals("harun", name5);
		System.out.println("Name Of The Employee:-" + name5);
		// 2
		int id5 = t5.EmployeeId();
		assertEquals(9567, id5);
		System.out.println("Employee ID:-" + id5);
		// 3
		String s5 = t5.nameOfEmployeeReporting();
		assertEquals("Sarla", s5);
		System.out.println("Employee Reports To:-" + s5);
		// 4
		int under5 = t5.noOfEmployeeUnderHim();
		assertEquals(7, under5);
		System.out.println("No Of Employee under current Employee:-" + under5);
		// 5
		int res5 = t5.noOfResoucesToThatProject();
		assertEquals(6, res5);
		System.out.println("Resources alloted to the project:-" + res5);
		// 6
		String tagged5 = t5.TaggedProject();
		assertEquals("Android Application", tagged5);
		System.out.println("Tagged Project:-" + tagged5);
		// 7
		int budget5 = t5.BudgetOfProject();
		assertEquals(9763300, budget5);
		System.out.println("Budget Of the Project:-" + budget5);
		// 8
		String ProName5 = t5.nameOftheProject();
		assertEquals("Android Apllication", ProName5);
		System.out.println("Name Of the Project:-" + ProName5);

		System.out.println("Main thread is- " + Thread.currentThread().getName());
		Thread t12111 = new Thread(new Employee3());
		t12111.start();
		
		
		System.out.println();

		// For Class 6
		Employee6 t6 = new Employee6();
		// 1
		String name6 = t6.nameOfEmployee();
		assertEquals("Suresh", name6);
		System.out.println("Name Of The Employee:-" + name6);
		// 2
		int id6 = t6.EmployeeId();
		assertEquals(1278, id6);
		System.out.println("Employee ID:-" + id6);
		// 3
		String s6 = t6.nameOfEmployeeReporting();
		assertEquals("Sarla", s6);
		System.out.println("Employee Reports To:-" + s6);
		// 4
		int under6 = t6.noOfEmployeeUnderHim();
		assertEquals(7, under6);
		System.out.println("No Of Employee under current Employee:-" + under6);
		// 5
		int res6 = t6.noOfResoucesToThatProject();
		assertEquals(6, res6);
		System.out.println("Resources alloted to the project:-" + res6);
		// 6
		String tagged6 = t6.TaggedProject();
		assertEquals("Oracle", tagged6);
		System.out.println("Tagged Project:-" + tagged6);
		// 7
		int budget6 = t6.BudgetOfProject();
		assertEquals(200000, budget6);
		System.out.println("Budget Of the Project:-" + budget6);
		// 8
		String ProName6 = t6.nameOftheProject();
		assertEquals("Oracle Application", ProName6);
		System.out.println("Name Of the Project:-" + ProName6);

		System.out.println("Main thread is- ");
		Thread t121111 = new Thread(new Employee3());
		t121111.start();
		
		
		System.out.println();

		// For Class 7
		Employee7 t7 = new Employee7();
		// 1
		String name7 = t7.nameOfEmployee();
		assertEquals("Elon", name7);
		System.out.println("Name Of The Employee:-" + name7);
		// 2
		int id7 = t7.EmployeeId();
		assertEquals(8732, id7);
		System.out.println("Employee ID:-" + id7);
		// 3
		String s7 = t7.nameOfEmployeeReporting();
		assertEquals("John", s7);
		System.out.println("Employee Reports To:-" + s7);
		// 4
		int under7 = t7.noOfEmployeeUnderHim();
		assertEquals(8, under7);
		System.out.println("No Of Employee under current Employee:-" + under7);
		// 5
		int res7 = t7.noOfResoucesToThatProject();
		assertEquals(100, res7);
		System.out.println("Resources alloted to the project:-" + res7);
		// 6
		String tagged7 = t7.TaggedProject();
		assertEquals("AI", tagged7);
		System.out.println("Tagged Project:-" + tagged7);
		// 7
		int budget7 = t7.BudgetOfProject();
		assertEquals(3000000, budget7);
		System.out.println("Budget Of the Project:-" + budget7);
		// 8
		String ProName7 = t7.nameOftheProject();
		assertEquals("AI Model", ProName7);
		System.out.println("Name Of the Project:-" + ProName7);

		System.out.println("Main thread is- ");
		Thread t1211111 = new Thread(new Employee3());
		t1211111.start();
		
		
		
		System.out.println();

		// For Class 8
		Employee8 t8 = new Employee8();
		// 1
		String name8 = t8.nameOfEmployee();
		assertEquals("Shivam", name8);
		System.out.println("Name Of The Employee:-" + name8);
		// 2
		int id8 = t8.EmployeeId();
		assertEquals(9613, id8);
		System.out.println("Employee ID:-" + id8);
		// 3
		String s8 = t8.nameOfEmployeeReporting();
		assertEquals("Elon", s8);
		System.out.println("Employee Reports To:-" + s8);
		// 4
		int under8 = t8.noOfEmployeeUnderHim();
		assertEquals(7, under8);
		System.out.println("No Of Employee under current Employee:-" + under8);
		// 5
		int res8 = t8.noOfResoucesToThatProject();
		assertEquals(8, res8);
		System.out.println("Resources alloted to the project:-" + res8);
		// 6
		String tagged8 = t8.TaggedProject();
		assertEquals("ML", tagged8);
		System.out.println("Tagged Project:-" + tagged8);
		// 7
		int budget8 = t8.BudgetOfProject();
		assertEquals(300000, budget8);
		System.out.println("Budget Of the Project:-" + budget8);
		// 8
		String ProName8 = t8.nameOftheProject();
		assertEquals("ML Application", ProName8);
		System.out.println("Name Of the Project:-" + ProName8);

		System.out.println("Main thread is- ");
		Thread t12111111 = new Thread(new Employee3());
		t12111111.start();
		
		
		System.out.println();

		// For Class 9
		Employee9 t9 = new Employee9();
		// 1
		String name9 = t9.nameOfEmployee();
		assertEquals("Abhinav", name9);
		System.out.println("Name Of The Employee:-" + name9);
		// 2
		int id9 = t9.EmployeeId();
		assertEquals(6388, id9);
		System.out.println("Employee ID:-" + id9);
		// 3
		String s9 = t9.nameOfEmployeeReporting();
		assertEquals("Elon", s9);
		System.out.println("Employee Reports To:-" + s9);
		// 4
		int under9 = t9.noOfEmployeeUnderHim();
		assertEquals(9, under9);
		System.out.println("No Of Employee under current Employee:-" + under9);
		// 5
		int res9 = t9.noOfResoucesToThatProject();
		assertEquals(8, res9);
		System.out.println("Resources alloted to the project:-" + res9);
		// 6
		String tagged9 = t9.TaggedProject();
		assertEquals("Data Managment", tagged9);
		System.out.println("Tagged Project:-" + tagged9);
		// 7
		int budget9 = t9.BudgetOfProject();
		assertEquals(100000, budget9);
		System.out.println("Budget Of the Project:-" + budget9);
		// 8
		String ProName9 = t9.nameOftheProject();
		assertEquals("Data Desingning", ProName9);
		System.out.println("Name Of the Project:-" + ProName9);

		System.out.println("Main thread is- ");
		Thread t121111111 = new Thread(new Employee3());
		t121111111.start();
		
		
		System.out.println();

		// For Class 10
		Employee10 t10 = new Employee10();
		// 1
		String name10 = t10.nameOfEmployee();
		assertEquals("Shewta", name10);
		System.out.println("Name Of The Employee:-" + name10);
		// 2
		int id10 = t10.EmployeeId();
		assertEquals(6167, id10);
		System.out.println("Employee ID:-" + id10);
		// 3
		String s10 = t10.nameOfEmployeeReporting();
		assertEquals("Elon", s10);
		System.out.println("Employee Reports To:-" + s10);
		// 4
		int under10 = t10.noOfEmployeeUnderHim();
		assertEquals(9999, under10);
		System.out.println("No Of Employee under current Employee:-" + under10);
		// 5
		int res10 = t10.noOfResoucesToThatProject();
		assertEquals(10, res10);
		System.out.println("Resources alloted to the project:-" + res10);
		// 6
		String tagged10 = t10.TaggedProject();
		assertEquals("System Managment", tagged10);
		System.out.println("Tagged Project:-" + tagged10);
		// 7
		int budget10 = t10.BudgetOfProject();
		assertEquals(400000, budget10);
		System.out.println("Budget Of the Project:-" + budget10);
		// 8
		String ProName10 = t10.nameOftheProject();
		assertEquals("System Desing & Managment", ProName10);
		System.out.println("Name Of the Project:-" + ProName10);

		System.out.println("Main thread is- ");
		Thread t1211111111 = new Thread(new Employee3());
		t1211111111.start();
		System.out.println();

	}
}
