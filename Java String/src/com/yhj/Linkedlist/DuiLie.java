package com.yhj.Linkedlist;

import java.util.LinkedList;

public class DuiLie {
	private LinkedList link;
	
	public DuiLie()
	{
		link = new LinkedList();
	}
	
	public void myAdd(Object obj)
	{
		link.addLast(obj);
	}
	
	public Object myGet()
	{
		return link.removeLast();
	}
	
	public boolean isNull()
	{
		return link.isEmpty();
	}
}
