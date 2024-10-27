package com.gentech.methods;
class Array
{
	void ReverseArray()
	{
		String name[]= {"abhi","Arjan","anush"};
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
	}
	
}

public class MethodsDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array o=new Array();
		o.ReverseArray();
	}

}
