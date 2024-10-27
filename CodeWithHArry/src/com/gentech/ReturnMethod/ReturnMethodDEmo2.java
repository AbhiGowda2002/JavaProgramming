package com.gentech.ReturnMethod;
class cityname
{
	String getcityname(String str)
	{
		return str;
	}
}

public class ReturnMethodDEmo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cityname o1=new cityname();
		String v=o1.getcityname("Bangalore");
		System.out.println(v);
	}

}
