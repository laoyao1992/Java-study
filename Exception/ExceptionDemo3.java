class FuShuIndexException extends RuntimeException
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
	public int method(int[] arr,int index) //throws NullPointerException, FuShuIndexException
	{		

		if(arr==null)
			throw new NullPointerException("the array is empty");

		if(index>=arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("the array is out of arrange: "+index);
		}
		if(index<0)
		{
			throw new FuShuIndexException("the index is negative");
		}
		
		return arr[index];
	}
}

class  ExceptionDemo3
{
	public static void main(String[] args) //throws NullPointerException, FuShuIndexException
	{
		int[] arr = new int[3];
		
		Demo d = new Demo();
		Demo d1 = new Demo();
		int num = d.method(arr,1);
		System.out.println("num="+num);
		System.out.println("over");
		System.out.println("d hashcode  is:"+d.hashCode());
		System.out.println("d1 hashcode is:"+d1.hashCode());
	}
	
}