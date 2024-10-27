package com.gentech.ReturnMethod;
class Array1D
{
	int[] gethalflength(int x[])
	{
		int halflength=x.length/2;
		int res[]=new int[halflength];
		for(int i=0;i<halflength;i++)
		{
			res[i]=x[i];
		}
		return res;
	}
}
public class ReturnMethodDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array1D o=new Array1D();
		int x[]= {20,30,40,50,60};
		int y[]=o.gethalflength(x);
		for(int i : y)
		{
			System.out.println(i);
		}
	}

}
