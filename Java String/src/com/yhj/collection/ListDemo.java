package com.yhj.collection;

import java.util.ArrayList;
import java.util.List;


public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
	}
	public static void show(List list) {
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		//list.remove(2);
		//System.out.println(list);
		System.out.println("get:"+list.get(0));
		System.out.println("set:"+list.set(1, "abc8"));
		System.out.println(list);
		System.out.println("sublist:"+list.subList(1, 2));
	}
	
}
