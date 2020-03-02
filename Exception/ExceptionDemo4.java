class FuShuIndexException extends Exception
{
	FuShuIndexException()
	{}

	
	FuShuIndexException(String msg)
	{
		super(msg);
	}
}


class Demo
{
	public int method(int[] arr,int index) throws FuShuIndexException
	{	
		if(arr==null)
			throw new NullPointerException("array is empty");
		if(index<0)
			throw new FuShuIndexException();
			
		return arr[index];
	}
}

class  ExceptionDemo4
{
	public static void main(String[] args) 
	{
		int[] arr = new int[3];		
		Demo d = new Demo();
		try
		{
			int num = d.method(null,-1);
			System.out.println("num="+num);
			
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.toString());
		}
		catch (FuShuIndexException e)
		{
			System.out.println("message:"+e.getMessage());
			System.out.println("string:"+e.toString());

			e.printStackTrace();

			System.out.println("the index is negative!!!!");
		}
		/*
		catch(Exception e)
		{
			
		}
		*/
		System.out.println("over");
	}
	
}