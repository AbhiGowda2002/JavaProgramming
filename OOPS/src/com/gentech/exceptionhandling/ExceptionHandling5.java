package com.gentech.exceptionhandling;
class Elegible
{
	public static void getresult(int score) throws Exception
	{
		try {
			
	
		if(score<35)
		{
			throw new Exception("you are not Elegible");
		}else {
			System.out.println("you are Elegible ");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("It always Executes");
		}
	}
}

public class ExceptionHandling5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Elegible.getresult(22);
	}

}
