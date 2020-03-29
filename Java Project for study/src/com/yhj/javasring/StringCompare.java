package com.yhj.javasring;

public class StringCompare {
	public static void main(String[] args) {

		String[] arr = { "nba", "abc", "cba", "zz", "qq", "haha" };

		printArray(arr);

		sortString(arr);

		printArray(arr);
	}
	
	public static void sortString(String[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i].compareTo(arr[j]) > 0)
					swap(arr, i, j);
			}
	}
	private static void swap(String[] arr, int i, int j)
	{
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void printArray(String[] arr)
	{
		System.out.print("[");
		for(int i = 0; i < arr.length; i++)
		{
			if(i != arr.length - 1)
				System.out.print(arr[i] + ", ");	
			else
				System.out.println(arr[i] + "]");
		}
		
	}
}
