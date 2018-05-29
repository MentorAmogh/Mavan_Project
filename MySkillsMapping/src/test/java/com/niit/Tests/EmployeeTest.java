package com.niit.Tests;

import junit.framework.TestCase;
import com.niit.config.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;

import com.niit.Model.EmployeeRegistration;
import com.niit.Service.EmpService;

import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.TestCase;



@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = ApplicationContext.class)

public class EmployeeTest extends TestCase {

	@Autowired
	private EmpService employeeService;
	EmployeeRegistration emp;

	@Before
	public void setup() {


		EmployeeRegistration emp1 = new EmployeeRegistration();
		emp1.setEmpId(1231);
		emp1.setEmpName("Krishna");
		emp1.setEmpEmail("krishna@gmail.com");
		emp1.setEmpMobile("9922411332");	
		emp1.setEmpGender("M");
		emp1.setEmpAddress("Dharampeth Area");
		emp1.setEmpCity("Nagpur");
		emp1.setEmpDob("19/02/1977");
		emp1.setEmpRole("Trainer");
		emp1.setEmpNationality("Indian");
		emp1.setEmpPassword("MyPassword");
		emp1.setEmpStatus("Active");
		emp1.setIBUName("ILS");
		emp1.setSupervisorContact("8149090662");
		emp1.setSupervisorId(1233);
		emp1.setSupervisorName("Amogh");
		
		
		EmployeeRegistration emp2 = new EmployeeRegistration();
		emp2.setEmpId(1131);
		emp2.setEmpName("Akshay");
		emp2.setEmpEmail("akshay@gmail.com");
		emp2.setEmpMobile("9422125009");	
		emp2.setEmpGender("M");
		emp2.setEmpAddress("Dharampeth Area");
		emp2.setEmpCity("Nagpur");
		emp2.setEmpDob("17/03/1977");
		emp2.setEmpRole("Trainer");
		emp2.setEmpNationality("Indian");
		emp2.setEmpPassword("YourPassword");
		emp2.setEmpStatus("Active");
		emp2.setIBUName("ILS");
		emp2.setSupervisorContact("8956904869");
		emp2.setSupervisorId(1233);
		emp2.setSupervisorName("Amogh");
		
		employeeService.addEmp(emp1);
		employeeService.addEmp(emp2);

	
	}
	/*
	 * @After public void teardown() {
	 * 
	 * employeeService.deleteEmp(employeeService.getEmpByName("John").getEmpId());
	 * employeeService.deleteEmp(employeeService.getEmpByName("Chris").getEmpId());
	 * if(employeeService.getEmpByName("Ryan")!=null) {
	 * employeeService.deleteEmp(employeeService.getEmpByName("Ryan").getEmpId()); }
	 * }
	 */

	// +ve test case

	
	/*  @Test public void testAddEmp() {
	  
	  EmployeeRegistration emp=new EmployeeRegistration(); emp.setEmpId(109);
	  emp.setEmpName("Ryan"); emp.setEmpEmailId("ryan@gmail.com");
	  emp.setEmpPassword("ryan@123"); emp.setRole("Project Manager");
	  assertEquals(true, employeeService.addEmp(emp));
	  }*/
	
	// -ve test
	/*
	 * @Test public void testAddEmp() {
	 * 
	 * EmployeeRegistration emp=new EmployeeRegistration();
	 * emp.setEmpId(103);//error as trying to insert same id emp.setEmpName("Ryan");
	 * emp.setEmpEmailId("ryan@gmail.com"); emp.setEmpPassword("ryan@123");
	 * emp.setRole("Project Manager"); assertEquals(true,
	 * employeeService.addEmp(emp));
	 * 
	 * }
	 */

	/*
	 * @Test public void testdeleteEmp() {
	 * 
	 * int id=1; assertEquals(true, employeeService.deleteEmp(id));
	 * 
	 * }
	 */
	/*
	 * @Test public void testdeleteEmp() {
	 * 
	 * int id=102; assertEquals(true, employeeService.deleteEmp(id));
	 * 
	 * }
	 */

	/*
	 * //-VE TEST CASE
	 * 
	 * @Test public void testGetEmpByName() {
	 * 
	 * EmployeeRegistration emp=new EmployeeRegistration();
	 * 
	 * 
	 * assertEquals(1,employeeService.getEmpByName("John").getEmpId());
	 * 
	 * }
	 */

	/*
	 * @Test public void testGetEmpByName() {
	 * 
	 * EmployeeRegistration emp=new EmployeeRegistration();
	 * 
	 * 
	 * assertEquals(101,employeeService.getEmpByName("John").getEmpId()); }
	 */

	
	/*  @Test 
	  public void testGetEmpById() {
	 
	 EmployeeRegistration emp=new EmployeeRegistration();
	
	 
	  assertEquals("John",employeeService.getEmpById(101).getEmpName());
	  
	  }*/
	 
	// +ve test case
	
	@Test 
	public void testGetEmpDetails() {
	 

	 int count = employeeService.getEmpDetails().size();

	assertEquals("success", 2, count); }
	
	// -ve test case

	/*
	 * @Test public void testGetEmpDetails() {
	 * 
	 * 
	 * int count = employeeService.getEmpDetails().size();
	 * 
	 * assertEquals("success", 3, count); }
	 */

/*@Test
	public void testUpdateEmp() {
	
		// emp = new EmployeeRegistration();
		
		emp = employeeService.getEmpById(108);
		
		emp.setEmpEmailId("test@gmail.com");
		
		
		System.out.println(emp);
		
		boolean flag = employeeService.updateEmp(emp);

		assertEquals("success", true, flag);
	}*/


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
