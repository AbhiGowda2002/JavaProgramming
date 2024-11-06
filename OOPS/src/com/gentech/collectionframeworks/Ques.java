package com.gentech.collectionframeworks;

import java.util.LinkedList;
import java.util.Queue;

public class Ques {

	public static void main(String[] args) {
		
		//addelements();
		Removeelements();
	}
	public static void addelements()
	{
		Queue <String> o=new LinkedList<String>();
		o.add("Apple");
		o.add("banana");
		o.add("Orange");
		o.add("grapes");
		o.add("pineapple");
		System.out.println(o);
	}
	public static void Removeelements()
	{
		Queue <String> o=new LinkedList<String>();
		o.add("Apple");
		o.add("banana");
		o.add("Orange");
		o.add("grapes");
		o.add("pineapple");
		System.out.println(o);
		
		
		o.remove();
		System.out.println(o);
	}
}
