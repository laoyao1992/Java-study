package com.yhj.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import com.yhj.bean.Person;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add(new Person("zhangsan", 27));
		hs.add(new Person("lisi", 26));
		hs.add(new Person("wangma", 25));
		hs.add(new Person("zhangsan", 27));
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			Person p = (Person)it.next();
			System.out.println("name is: "+p.getName()+"age is: "+p.getAge());
		}
	}
}
