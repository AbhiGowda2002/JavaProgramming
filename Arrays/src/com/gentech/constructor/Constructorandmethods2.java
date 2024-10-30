package com.gentech.constructor;
class Parks
{
	String Parkname;
	String Address;
	Parks(String parkname,String address)
	{
		this.Parkname=parkname;
		this.Address=address;
		System.out.println(parkname);
		System.out.println(address);
	}

	void display()
	{
		System.out.println(Parkname);
		System.out.println(Address);
	}
}
public class Constructorandmethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parks obj=new Parks("ANAND Parak","Bangalore");
		obj.display();
	}

}
