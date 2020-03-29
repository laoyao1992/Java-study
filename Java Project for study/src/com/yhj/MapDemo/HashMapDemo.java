package com.yhj.MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.yhj.bean.Student;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap<Student, String>();
		
		hm.put(new Student("xiaohua", 30), "beijing");
		hm.put(new Student("xiaohong", 32), "hefei");
		hm.put(new Student("xiaozhang", 20), "changzhou");
		hm.put(new Student("xiaonan", 28), "nanjing");
		hm.put(new Student("xiaoniu", 29), "guangzhou");
		
		Iterator<Student> it = hm.keySet().iterator();
		
		while(it.hasNext()) {
			Student key  = it.next();
			String value = hm.get(key);
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		
		/*Iterator<Map.Entry<Student, String>> it = hm.entrySet().iterator();
		while(it.hasNext()) { 
			Map.Entry<Student, String> me = it.next();
			Student key = me.getKey();
			String value = me.getValue();
			System.out.println(key.getName()+":"+key.getAge()+"----"+value);
		}*/
	}
}
