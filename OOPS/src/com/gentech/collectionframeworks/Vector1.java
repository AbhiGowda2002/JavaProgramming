package com.gentech.collectionframeworks;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	getelements();
	//	removeelements();
		readelements();
	}
	public static void getelements()
	{
		Vector<String> o=new Vector<String>();
		
		o.add("Abhishek");
		o.add("Anush");
		o.add("Abhi");
		o.add("varun");
		o.add("Varsha");
		o.add("Rohith");
		System.out.println(o);
		
	}
	public static void removeelements()
	{
		Vector<String> o=new Vector<String>();
		
		o.add("Abhishek");
		o.add("Anush");
		o.add("Abhi");
		o.add("varun");
		o.add("Varsha");
		o.add("Rohith");
		System.out.println(o);
		
		o.remove(0);
		System.out.println(o);
		o.remove("Abhi");
		System.out.println(o);
		o.removeAll(o);
		System.out.println(o);
		
	}
	public static void readelements()
	{
Vector<String> o=new Vector<String>();
		
		o.add("Abhishek");
		o.add("Anush");
		o.add("Abhi");
		o.add("varun");
		o.add("Varsha");
		o.add("Rohith");
		for(int i=0;i<=o.size()-1;i++)
		{
			System.out.println(o.get(i));
		}
	}

}
