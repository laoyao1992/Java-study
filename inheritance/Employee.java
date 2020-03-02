package inheritance;

import java.time.*;

public class Employee{
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day)
	{
		this.name   = name;
		this.salary = salary;
		hireDay     = LocalDate.of(year, month, day);
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}

	public LocalDate getHireday()
	{
		return hireDay;
	}
	
	public void raiseSalary(double percent)
	{
		double raise = salary * percent / 100;
		salary += raise;
	}
}
