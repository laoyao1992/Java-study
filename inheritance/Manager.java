package inheritance;

public class Manager extends Employee
{
	private double bonus;
	public Manager(String name, double salary, int year, int month, int day)
	{
		super(name, salary, year, month, day);
		bonus = 0;
	}
	
	public void setBonus(double b)
	{
		bonus = b;
	}
	
	public double getSalary()
	{
		double salary = super.getSalary();
		salary = salary + bonus;
		return salary;
	}
}