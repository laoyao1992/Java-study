class Bank
{
	private int sum;
	//private Object obj = new Object();
	public  void add(int num)
	{
		//synchronized(obj)
		{
			sum = sum + num;
			System.out.println(Thread.currentThread().getName()+"...sum="+sum);
		}

	}
}

class Cus implements Runnable
{
	private Bank b = new Bank();
	//private Object obj = new Object();
	public void run()
	{
		//synchronized(obj)
		{
			for(int i = 0; i < 3; i++)
			{	
				b.add(100);
			}
		}

	}
}

class BankDemo
{
	public static void main(String[] args)
	{
		Cus c = new Cus();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}