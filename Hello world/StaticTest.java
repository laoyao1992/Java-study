public class StaticTest
{
	public static void main(String[] args)
	{
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Tom", 40000);
		staff[1] = new Employee("jack", 5000);
		staff[2] = new Employee("Mary", 10000);
		for(Employee e : staff)
		{
			e.setId();
			System.out.println("name=" + e.getName() + ",Id=" + e.getId() + ", salary=" + e.getSalary());
		}
		int n = Employee.getNextId();
		System.out.println("Next available id =" + n);
	}
}

class Employee
{
	private static int nextId = 1;
	private String name;
	private double salary;
	private int id;
	
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
		id = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId()
	{
		id = nextId;
		nextId++;
	}
	
	public static int getNextId()
	{
		return nextId;
	}
	
	public static void main(String[] args)
	{
		Employee e = new Employee("Harry", 50000);
		System.out.println("The name is "+e.getName()+", salary is "+e.getSalary());
	}
}