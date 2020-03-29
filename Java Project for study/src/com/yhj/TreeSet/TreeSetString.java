package com.yhj.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

import com.yhj.Comparator.ComparatorByLength;

public class TreeSetString {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new ComparatorByLength());
		ts.add("abc");
		ts.add("dghfd");
		ts.add("fbjkfbj");
		ts.add("ad");
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			String s1 = (String)it.next();
			System.out.println("String:"+s1);
		}
		
	}
}
