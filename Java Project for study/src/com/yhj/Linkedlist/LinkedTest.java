package com.yhj.Linkedlist;

public class LinkedTest {
	public static void main(String[] args) {
		DuiLie d1 = new DuiLie();
		
		d1.myAdd("abc1");
		d1.myAdd("abc2");
		d1.myAdd("abc3");
		d1.myAdd("abc4");
		while(!d1.isNull()) {
			System.out.println(d1.myGet());
		}
	}
}
