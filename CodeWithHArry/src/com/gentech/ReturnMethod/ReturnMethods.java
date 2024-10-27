package com.gentech.ReturnMethod;
class Demo1
{
	int getsum(int ...arr)
	{
		int res=0;
		for(int a:arr)
		{
			res=res+a;
		}
		return res;
	}
}

public class ReturnMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 o=new Demo1();
		int v1=o.getsum(1,2);
		System.out.println(v1);
		int v2=o.getsum(20,30,40);
		System.out.println(v2);
		int v3=o.getsum(20,40,50,60,70);
		System.out.println(v3);
	}
	

}
