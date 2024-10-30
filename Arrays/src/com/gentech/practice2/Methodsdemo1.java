package com.gentech.practice2;
class Methods
{
	void Addition()
	{
		int x,y,z;
		x=43;y=55;
		z=x+y;
		System.out.println(z);
		System.out.println("------------");
	}

   void Multiplication()
{
	   int x,y,z;
	   x=22;y=33;
	   z=x*y;
	   System.out.println(z); 
	   System.out.println("---------------");
	   
}
   void Countthesum()
   {
	   int count=0;
	   for(int i=0;i<=10;i++)
	   {
		   count=count+i;
	   }
	   System.out.println(count);
	   System.out.println("------------");
   }
   void OneDArray()
   {
	   int arr[]=new int[3];
	   arr[0]=22;
	   arr[1]=33;
	   arr[2]=44;
	   System.out.println(arr[0]);
	   System.out.println(arr[1]);
	   System.out.println(arr[2]);
	   System.out.println("--------------");
   }
   void onedarray()
   {
	   int marks[]=new int[5];
	   marks[0]=88;
	   marks[1]=99;
	   marks[2]=89;
	   marks[3]=67;
	   marks[4]=78;
	   for(int i=0;i<=4;i++)
	   {
		   System.out.println(marks[i]);
		   System.out.println("---------");
	   }
   }
   void Stringlength()
   {
	   String str;
	   str="welcome";
	   int length=str.length();
	   System.out.println(length);
   }
   void displayfactorial()
   {
	   int fact=1;
	   int num=5;
	   for(int i=1;i<=num;i++)
	   {
		   fact=fact*i;
	   }
	   System.out.println(fact);
   }
   void array()
   {
	   int marks[]= {20,40,50,60,70};
	   int sum=0;
	   for(int i=0;i<=4;i++)
	   {
		   sum=sum+i;
	   }
	   System.out.println(sum);
   }
   void Primenumbers()
   {
	   boolean istrue;
	   int num=100;
	   for(int i=1;i<=100;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   if(i%j==0)
			   {
				   boolean isfalse;
			   }
			  System.out.println(i);
		   }
	   }
   }
}
   
   


public class Methodsdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods o=new Methods();
		o.Addition();
		o.Multiplication();
		o.Countthesum();
		o.OneDArray();
		o.onedarray();
		o.Stringlength();
		o.displayfactorial();
		o.array();
		o.Primenumbers();
	}

}
