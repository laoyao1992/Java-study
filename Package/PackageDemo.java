package mypack;

class  PackageDemo
{
	public static void main(String[] args) 
	{

		//packa.DemoA d = new packa.DemoA();
		packa.DemoA d = new packa.DemoA();
		d.show();

		packb.DemoB b = new packb.DemoB();
		b.method();
		System.out.println("Hello Package!");
	}
}