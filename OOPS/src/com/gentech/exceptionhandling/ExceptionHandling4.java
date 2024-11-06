package com.gentech.exceptionhandling;
class Voting
{
	public static void Eligibleforvoting(int age) throws Exception{
		try {
			if(age<18)
			{
				throw new Exception("Age should be greater than 18");
			}else {
				System.out.println("Elegible for voting");		
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("It executes always");
		}
	}

}

public class ExceptionHandling4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Voting.Eligibleforvoting(18);
	}
}
