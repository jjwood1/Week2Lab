package model;

public class Employee {
	
	private String name;
	private double monthlySalary;
	private int age;
	
	public Employee()
	{
		
	}
	public Employee(String name)
	{
		this.name = name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setMonthlySalary(double monthlySalary)
	{
		this.monthlySalary = monthlySalary;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	public int getAge()
	{
		return age;
	}
}
