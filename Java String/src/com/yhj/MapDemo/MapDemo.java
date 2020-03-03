package com.yhj.MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		//method(map);
		method_2(map);
	}
	
	public static void method_2(Map<Integer, String> map) {
		map.put(8, "zhaosan");
		map.put(10, "xiaohua");
		map.put(11, "xiaosan");
		map.put(12, "xiaohong");
		
		Collection<String> values = map.values();
		
		Iterator<String> it2 = values.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		/*
		 * 通过Map转成set就可以迭代。
		 * 找到了另一个方法。entrySet。
		 * 该方法将键和值的映射关系作为对象存储到了Set集合中，而这个映射关系的类型就是Map.Entry类型
		 * 
		 * 
		 */
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> me = it.next();
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key+"::::"+value);
		}
		
		
	}
	

	
	
	
	public static void method(Map<Integer, String> map) {
		System.out.println(map.put(8, "wangcai"));
		System.out.println(map.put(8, "xiaozhang"));
		map.put(2, "xiaohua");
		map.put(3, "xiaoxia");
		
		System.out.println("get:"+map.get(8));
		
		System.out.println(map);
		
	}
	
}
