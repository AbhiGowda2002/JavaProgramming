package com.gentech.constructor;
class Numbers
{
	int sum=0;
	void getnumbers()
	{
		for(int i=1;i<=50;i++)
		{
			sum=sum+i;
		}
		System.out.println("the sum of numbers 1 to 50 is:"+sum);
	}
	int num=5;
	int fact=1;
	void getfactorial()
	{
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of the given numbers is;"+fact);
	}
}



public class methodsdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers obj=new Numbers();
		obj.getnumbers();
		obj.getfactorial();

	}

}
