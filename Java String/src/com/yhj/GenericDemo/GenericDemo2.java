package com.yhj.GenericDemo;

import java.util.Iterator;

import java.util.TreeSet;

import com.yhj.Comparator.ComparatorByNameT;

import com.yhj.bean.Person;

public class GenericDemo2 {
	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByNameT());
		ts.add(new Person("xiaohua", 13));
		ts.add(new Person("bazhang", 8));
		ts.add(new Person("xiaohua", 10));
		ts.add(new Person("huahua", 10));
		ts.add(new Person("xiaxia", 20));
		
		Iterator<Person> it = ts.iterator();
		
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println("name:"+p.getName()+"----age:"+p.getAge());
		}
	}
	
}
