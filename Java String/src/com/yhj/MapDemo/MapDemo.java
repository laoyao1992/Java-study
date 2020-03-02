package com.yhj.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		method(map);
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
