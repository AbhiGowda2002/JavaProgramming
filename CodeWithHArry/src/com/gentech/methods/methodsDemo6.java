package com.gentech.methods;
class Addition
{
	void sumofnumbers(int num,int sum)
	{
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	void sumofnumbers1(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
	}
}

public class methodsDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition o=new Addition();
		o.sumofnumbers(50, 0);
		o.sumofnumbers1(100);
	}

}
