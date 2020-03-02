package com.yhj.javasring;

public class StringDemo1 {
		public static void main(String[] args)
		{
			//System.out.println("Hello wolrd....");
			StringDemo1();
			StringDemo2();
		}
		
		public static void StringDemo1() {
			//String s   = new String();
			byte[] arr = {100,97,98,99};
			String s1  = new String(arr);
			System.out.println("s1="+s1);
		}
		
		public static void StringDemo2() {
			char[] arr = {'w', 'a', 'b', 'c', 'x'};
			String s = new String(arr, 1, 3);
			System.out.println("s="+s);
		}
}
