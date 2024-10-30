package com.gentech.constructor;
class Methods
{
	void addition()
	{
		int x,y,z;
		x=45;y=60;
		z=x+y;
		System.out.println("The addition result is:"+z);
	}
	void multiplication()
	{
		int x,y,z;
		x=20;y=40;
		z=x*y;
		System.out.println("The Multiplication result is:"+z);
	}
}

public class Methodsdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods o=new Methods();
		o.addition();
		o.multiplication();

	}

}
