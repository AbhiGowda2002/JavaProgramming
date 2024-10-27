package com.gentech.assignment1;

class Array1D
{
	void secondHalf(String a[])
	{
		for(int i=0;i<a.length/2;i++)
		{
			System.out.println("Second Half of Array :"+a[i]);
		}
	}
}
public class MainDemo1 {
	public static void main(String [] args) {
		String b[]= {"bengaluru","Hassan","mandya","Raichur","Bidar","Ballary"};
		Array1D ob1=new Array1D();
		ob1.secondHalf(b);
	}

}
