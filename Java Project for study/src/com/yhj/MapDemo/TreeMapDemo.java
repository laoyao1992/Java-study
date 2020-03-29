package com.yhj.MapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.yhj.bean.Student;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<Student, String>();
		
		tm.put(new Student("xiaohua", 30), "beijing");
		tm.put(new Student("xiaohong", 32), "hefei");
		tm.put(new Student("xiaozhang", 20), "changzhou");
		tm.put(new Student("xiaonan", 28), "nanjing");
		tm.put(new Student("xiaoniu", 29), "guangzhou");
		
		/*��ȡentryset��ĵ�����*/
		Iterator<Map.Entry<Student, String>> it = tm.entrySet().iterator();
		
		/*�Ȼ�ȡ����ӳ���ϵ��set���ϳ�Ա*/
		/*Ȼ��ʹ�øó�Ա�ֱ��ȡkey��value*/
		while(it.hasNext()) {
			Map.Entry<Student, String> me = it.next();
			Student key = me.getKey();
			String value = me.getValue();
			System.out.println(key.getName()+":"+key.getAge()+"---"+value);
		}
		
	}
}
