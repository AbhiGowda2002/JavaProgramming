package com.gentech.methods;
class values
{
	void Booleanvalue()
	{
		boolean val[]= {true,false,true,false,true,false};
		for(int i=val.length-1;i>=0;i--)
		{
			System.out.println(val[i]);
		}
	}
	
	
}

public class MethodDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		values o=new values();
		o.Booleanvalue();
	}

}
