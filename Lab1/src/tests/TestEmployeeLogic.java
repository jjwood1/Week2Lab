package tests;
import org.junit.*;
import static org.junit.Assert.*;
import model.*;
public class TestEmployeeLogic {
	EmpBusinessLogic empBL = new EmpBusinessLogic();
	Employee employee = new Employee("Ryan");
	
	@Before
	public void setUp() throws Exception{
		
	}
	
	@Test
	public void testCalulateAppraisal()
	{
		System.out.println("Inside testCalulateAppraisal()");
		employee.setMonthlySalary(8000);
		double appraisal = empBL.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
	}
	@Test
	public void testCalculateYearlySalary()
	{
		System.out.println("Inside testCalculateYearlySalary()");
		employee.setMonthlySalary(8000);
		double salary = empBL.calculateYearlySalary(employee);
		assertEquals(96000, salary, 0.0);
	}
	@Test
	public void testEmployeeIsRetiermentAge()
	{
		System.out.println("Inside testEmployeeIsRetirementAge()");
		employee.setAge(70);
		assertTrue(empBL.isRetirementAge(employee));
	}
	@Test
	public void testEmployeeIsNotRetirementAge()
	{
		System.out.println("Inside testEmployeeIsNotRetirementAge()");
		employee.setAge(25);
		assertFalse(empBL.isRetirementAge(employee));
	}
}
