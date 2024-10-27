package com.gentech.constructor;
 class vehicle
 {
	 String vehiclename;
	 int price;
	 vehicle(String name,int price)
	 {
		 vehiclename=name;
		 price=price;
		 System.out.println("vehiclename is:"+vehiclename);
		 System.out.println("price is:"+price);
	 }
 }
 class product2
 {
	 String name;
	 int price;
	 product2(String name,int price)
	 {
		 name=name;
		 price=price;
		 System.out.println("productname is "+name);
		 System.out.println("price is "+price);
	 }
			 
 }

public class ParameterizedConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle o=new vehicle("bajaj",25000);
		
		product2 o1=new product2("lenovo",20000);
	}

}
