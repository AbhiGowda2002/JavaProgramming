package com.gentech.polymorphism;
abstract class College 
{
	abstract void showcollegename(String collegename);
	abstract void showcityname(String cityname);
	void showcources()
	{
		
	     String cources="Maths,physics,Science,bio";
			System.out.println(cources);
	}
}
class BIT extends College
{
	void showcollegename(String collegename)
	{
		System.out.println(collegename);
	}

	@Override
	void showcityname(String cityname)
	{
	System.out.println(cityname);	
	}
	void displayaddress(String address)
	{
		System.out.println(address);
	}

}
public class Demo2 {
    public static void main(String[] args) {
    	BIT clg=new BIT();
    	clg.showcityname("Bangalore");
    	clg.showcollegename("BIT");
    	clg.showcources();
    	clg.displayaddress("VV PURAM");
    }
}
