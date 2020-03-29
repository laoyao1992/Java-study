package com.yhj.bean;

public class Person implements Comparable{
	private String name;
	private int age;
	
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int hashCode() {
		return name.hashCode() + 27 * age;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(!(obj instanceof Person))
			throw new ClassCastException("¿‡–Õ¥ÌŒÛ");
		
		Person p = (Person)obj;
		//System.out.println(this.name+" is equals:"+p.getName());
		return this.name.equals(p.name) && this.age == p.age;
	}
	
	public String toString() {
		return name+":"+age;
	}
	
	public int compareTo(Object o) {
		Person p = (Person)o;
		
		int temp = this.age - p.age;
		return temp==0?this.name.compareTo(p.name):temp;
	}
	
}
