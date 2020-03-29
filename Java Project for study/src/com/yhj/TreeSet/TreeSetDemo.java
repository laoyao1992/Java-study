package com.yhj.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

import com.yhj.Comparator.ComparatorByName;
import com.yhj.bean.Person;

public class TreeSetDemo {
	
	public static void main(String[] args){
		TreeSet ts = new TreeSet(new ComparatorByName());
		
		ts.add(new Person("zhangsan", 28));
		ts.add(new Person("lisi", 24));
		ts.add(new Person("xiaoming", 25));
		ts.add(new Person("wangu", 27));
		ts.add(new Person("hahaha", 28));
		
		Iterator it =ts.iterator();
		
		while(it.hasNext()) {
			Person p = (Person)it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}
	
}
