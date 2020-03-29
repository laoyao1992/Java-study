package com.yhj.GenericDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		int arr[] = new int[4];
		
		al.add("abc");
		al.add("def");
		al.add(new String("123"));
		//al.add(arr[0]);
		
		Iterator<String> it = al.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println("String is "+str);
		}
	}
}
