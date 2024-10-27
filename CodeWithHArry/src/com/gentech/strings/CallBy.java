package com.gentech.strings;
class callbyvalue
{
	void calculate(int x ,int y)
	{
		x+=100;
		y*=9;
		System.out.println(x);
		System.out.println(y);
	}
}

public class CallBy {

	public static void main(String[] args) {
		int x ;int y;
		x=10;y=5;
		System.out.println(x);
		System.out.println(y);
		
		callbyvalue call =new callbyvalue();
		call.calculate(x, y);
		System.out.println(x);
		System.out.println(y);
		

	}

}
