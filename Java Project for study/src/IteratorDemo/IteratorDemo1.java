package IteratorDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo1 {
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		for(Iterator it = coll.iterator(); it.hasNext();)
		{
			System.out.println(it.next());
		}
	}
}
