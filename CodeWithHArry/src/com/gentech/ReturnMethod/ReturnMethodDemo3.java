package com.gentech.ReturnMethod;
class Birds
{
	String[] getbirdsname()
	{
		String birds[]= {"Parrot","eagle","pigon","crow","Kingfisher"};
		return birds;
	}
	String getcityname()
	{
		String str="Bangalore";
		return str;
	}
}

public class ReturnMethodDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds o=new Birds();
		String s[]=o.getbirdsname();
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
			
		}
		System.out.println("++++++++++++++");
		String p=o.getcityname();
		System.out.println(p);
	}

}
