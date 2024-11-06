package com.gentech.exceptionhandling;
class Demo1
{
	public static void getsumofnumbers(int num)
	{
		try {
			int sum=0;
			for(int i=1;i<=num;i++)
			{
				sum=sum+i;
			}
			System.out.println(sum);
		}catch(ArithmeticException e) {
			
			e.printStackTrace();
		}catch(Exception e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("It executes Always");
		}
		
	}
}

public class ExceptionHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1.getsumofnumbers(50);
	}

}
