package com.gentech.collectionframeworks;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		//addfruits();
		//deletefruits();
		//readelements();
		ReadElementsByIterator();
	}
	private static void addfruits()
	{
		ArrayList<String> o=new ArrayList<String>();
		System.out.println("fruits"+o);
		o.add("banana");
		o.add("orange");
		o.add("grapes");
		o.add("Apple");
		System.out.println("fruits"+o);
	}
	private static void deletefruits()
	{
		ArrayList<String> oo=new ArrayList<String>();
		oo.add("Apple");
		oo.add("BAnana");
		oo.add("Grapes");
		oo.add("Orange");
		System.out.println("Fruits are"+oo);
		
		oo.remove(0);
		System.out.println(oo);
		
		oo.remove("Grapes");
		System.out.println(oo);
		
		oo.removeAll(oo);
		System.out.println(oo);
	}
	private static void readelements()
	{
		ArrayList<String> mm=new ArrayList<String>();
		System.out.println(mm);
		mm.add("Abhishek");
		mm.add("Vidya");
		mm.add("varun");
		mm.add("anand");
		mm.add("Ajay");
		System.out.println(mm);
		
		for(int i=0;i<=mm.size()-1;i++)
		{
			System.out.println(mm.get(i));
		}
	}
	private static void ReadElementsByIterator()
	{
		ArrayList<String> oo=new ArrayList<String>();
		oo.add("Apple");
		oo.add("BAnana");
		oo.add("Grapes");
		oo.add("Orange");
		System.out.println("Fruits are"+oo);
		
		Iterator <String> ite=oo.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
}
