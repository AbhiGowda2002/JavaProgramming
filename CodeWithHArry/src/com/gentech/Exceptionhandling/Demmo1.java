package com.gentech.Exceptionhandling;
class ExceptionHandling
{
	static int  getcharacterCount(String str) throws Exception
	{
		if(str==null)
		{
			throw new Exception("please Provide valid input");
		}
		return str.length();
	}
}
public class Demmo1 {

	public static void main(String[] args)  
	{
		try
		{
			int v1=ExceptionHandling.getcharacterCount("programmingkjdjsh");
			System.out.println(v1);
			
			int v2=ExceptionHandling.getcharacterCount(null);
			System.out.println(v2);
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		
		}
		
	}

}
