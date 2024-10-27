package com.gentech.ReturnMethod;
class demoo2
{
	int getfact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	void getprime(int num)
	{
	
    if (num == 2) 
    {
        System.out.println(num + " is a prime number");
        return;
    }

    boolean isPrime = true;
    for (int i = 2; i <= Math.sqrt(num); i++) 
     {
        if (num % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) 
    {
        System.out.println(num + " is a prime number");
    } 
    else 
    {
        System.out.println(num + " is not a prime number");
    }
}
	
}
public class Recursion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demoo2 o=new demoo2();
		int v1=o.getfact(10);
		System.out.println(v1);
		o.getprime(2);
	}

}
