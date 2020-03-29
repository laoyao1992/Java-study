package com.yhj.Comparator;

import java.util.Comparator;

import com.yhj.bean.Person;

public class ComparatorByNameT implements Comparator<Person>{
	public int compare(Person o1, Person o2) {
		int temp = o1.getName().compareTo(o2.getName());
		return temp==0?o1.getAge()-o2.getAge():temp;
	}
}
