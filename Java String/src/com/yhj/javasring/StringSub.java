package com.yhj.javasring;

public class StringSub {
	public static void main(String[] args)
	{
		String str  = "abchjdabcsvkabcvfkabcfhabc";
		String key  = "abc";
		
		int count = getSubStringCount2(str, key);
		System.out.println("count="+count);
	}
	
	public static int getSubStringCount(String str, String key)
	{
		int count = 0;
		int index = 0;
		while((index = str.indexOf(key)) != -1)
		{
			str = str.substring(index+key.length());
			count++;
		}
		return count;
	}
	
	public static int getSubStringCount2(String str, String key)
	{
		int count = 0;
		int index = 0;
		while((index = str.indexOf(key, index)) != -1)
		{
			index = index + key.length();
			count++;
		}
		return count;
	}
}
