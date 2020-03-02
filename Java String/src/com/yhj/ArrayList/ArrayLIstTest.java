package com.yhj.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import com.yhj.bean.Person;

public class ArrayLIstTest {
	public static void main(String[] args) 
	{
		Person p1 = new Person("xiaoming", 25);
		ArrayList a1 = new ArrayList();
		a1.add(p1);
		a1.add(new Person("xiaohua", 23));
		a1.add(new Person("xiaozhang", 22));
		
		Iterator it = a1.iterator();
		while(it.hasNext()){
			Person p = (Person) (it.next());
			System.out.println("The name is: "+p.getName()+" age is: "+p.getAge());
		}
	}
}
