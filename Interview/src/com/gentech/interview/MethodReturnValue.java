package com.gentech.interview;
class Mathss
{
	public int getaddition(int a,int b)
	{
		int res=a+b;
		return res;
		
	}
	public String getname(String name) 
	{
		return name;
	}
	public String getNativeName(String name)
	{
		return name;
	}
}

public class MethodReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathss o=new Mathss();
		int val=o.getaddition(10, 10);
		System.out.println(val);
		
		System.out.println("------------");
		
		String str=o.getname("Abhishek");
		System.out.println(str);
		
		String name=o.getNativeName("kanakapura");
		System.out.println(name);
		
	}
	

}
