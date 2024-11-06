package com.gentech.exceptionhandling;
class exception
{
	public static void getaddition(int x,int y) {
		
		try {
			int res=x+y;
			System.out.println(res);
		}catch (Exception e) {
			e.printStackTrace();		
		}finally {
			System.out.println("It executes Always");
		}
		
	}
}

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exception.getaddition(10, 10);
	}

}
