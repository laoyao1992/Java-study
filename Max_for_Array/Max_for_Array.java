class ArrayDemo4
{
	public static void main(String[] args)
	{
		int[] arr = {10, 12, 50, 5, 20};
		int max = getMax(arr);
		System.out.println("max="+max);
	}
	
	public static int getMax(int[] arr)
	{
		int maxElement = arr[0];
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x] > maxElement)
				maxElement = arr[x];
		}	
		return maxElement;
	}
}

