package com.yhj.javasring;

public class StringMethod {
	public static void main(String[] args) {
		//StringDemo3();
		stringMethodDemo_2();
	}
	private static void StringMethodDemo1() {
		String s = "abcde";
		System.out.println("length:"+s.length());//6
		System.out.println("char:"+s.charAt(2));//c//StringIndexOutOfBoundsException
		System.out.println("index:"+s.indexOf('k'));//0//-1 ���ǿ��Ը���-1�����жϸ��ַ������ַ����Ƿ���ڡ�
		System.out.println("lastIndex:"+s.lastIndexOf('a'));//4
		
		
		System.out.println("substring:"+s.substring(0,5));
	}
	
private static void stringMethodDemo_2() {
		
		String  s = "����,����,����";
		String[] arr = s.split(",");  //�ַ�������
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		char[] chs = s.toCharArray();    //�ַ�����
		
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}
		
		s = "ab��";
		byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		
		System.out.println("Abc".toUpperCase());
		System.out.println("Abc".toLowerCase());
		
		String s1 = "java";
		String s2 = s1.replace('q', 'z');
		System.out.println(s1==s2);//true
		
		System.out.println("-"+"    ab  c    ".trim()+"-");
		
	}
	
}
