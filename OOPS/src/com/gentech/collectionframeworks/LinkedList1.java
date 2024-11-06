package com.gentech.collectionframeworks;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addelements();
		//Deleteelements();
		ReadelementsByIterator();
		
	}
	public static void addelements()
	{
		LinkedList<String> o=new LinkedList<String>();
		
		o.add("Apple");
		o.add("banana");
		o.add("Pine Apple");
		o.add("Mango");
		o.add("Orange");
		o.add("Grapes");
		for(int i=0;i<=o.size()-1;i++)
		{
			System.out.println(o.get(i));
		}
		
	}
	public static void Deleteelements()
	{
		LinkedList<String> o=new LinkedList<String>();
		System.out.println("elements"+o);
		o.add("Apple");
		o.add("banana");
		o.add("Pine Apple");
		o.add("Mango");
		o.add("Orange");
		o.add("Grapes");
		for(int i=0;i<=o.size()-1;i++)
		{
			System.out.println(o.get(i));
		}
		
		o.remove(0);
		System.out.println(o);
		
		o.remove("banana");
		System.out.println(o);
		
		o.removeAll(o);
		System.out.println(o);
		
	}
	public static void ReadelementsByIterator()
	{
		LinkedList<String> o=new LinkedList<String>();
		System.out.println("elements"+o);
		o.add("Apple");
		o.add("banana");
		o.add("Pine Apple");
		o.add("Mango");
		o.add("Orange");
		o.add("Grapes");
		
		Iterator<String> ite=o.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
}
