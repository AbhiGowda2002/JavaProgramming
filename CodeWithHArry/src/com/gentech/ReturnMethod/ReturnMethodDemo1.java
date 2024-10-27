package com.gentech.ReturnMethod;
class Methods
{
	boolean isprimeornot(int num)
	{
		boolean prime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				prime=false;
				break;
			}
		}
		if(prime==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class ReturnMethodDemo1 {

	public static void main(String[] args) {
		Methods o=new Methods();
		boolean val=o.isprimeornot(20);
		System.out.println(val);
		
	}

}
