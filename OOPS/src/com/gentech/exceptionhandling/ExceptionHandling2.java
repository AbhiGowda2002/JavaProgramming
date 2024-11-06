package com.gentech.exceptionhandling;
class Demo
{
	public static void getsquare(int num) {
		
		try {
			int res=num*num;
			System.out.println(res);
		}catch(Exception e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("It executes always");
		}
		
	}
	
}

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo.getsquare(32);
	}

}
