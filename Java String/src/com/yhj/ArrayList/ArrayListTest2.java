package com.yhj.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import com.yhj.bean.Person;

public class ArrayListTest2 {
	 public static void main(String[] args) {
		 ArrayList al = new ArrayList();
		 al.add(new Person("lihua", 25));
		 al.add(new Person("litao", 24));
		 al.add(new Person("xiaoming", 26));
		 al.add(new Person("xiaohua", 26));
		 al.add(new Person("lihua", 25));
		 al.add(new Person("xiaoming", 26));
		 System.out.println(al);
		 
		 al = getSingleElement(al);
		 
		 System.out.println(al);
		 
	 }
	 
	 public static ArrayList getSingleElement(ArrayList al) {
		//1,定义一个临时容器。
		 ArrayList temp = new ArrayList();
		//2,迭代al集合。
		 Iterator it = al.iterator();
		//3,判断被迭代到的元素是否在临时容器存在。
		 while(it.hasNext()) {
			 Object obj = it.next();
			 if(!temp.contains(obj)) {
				 temp.add(obj);
			 }
		 }
			 
		 return temp;
	 }
}
