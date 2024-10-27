package com.gentech.oops;
class Students1
{
	public void marks(int sub1,int sub2)
	{
		int total1=sub1+sub2;
		System.out.println(total1);
	}
}
class Students2 extends Students1
{	
	String Subname;
	String teachername;
	void subject(String Subname,String teachername)
	{
		Subname=Subname;
		teachername=teachername;
		System.out.println(Subname);
		System.out.println(teachername);
	}
}
class College extends Students1
{	
	int clgid;
	String clgname;
	public void college(int clgid,String clgname)
	{
		clgid=clgid;
		clgname=clgname;
		System.out.println(clgid);
		System.out.println(clgname);
	}
}
class Teacher extends College
{		
	String teachername;
	public void  teachername(String teachername)
	{
		teachername=teachername;
		System.out.println(teachername);
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students2 o=new Students2();
		o.marks(20,20);
		o.subject("Maths","santosh");
		
		Teacher o1=new Teacher();
		o1.college(121,"BIT");
		o1.teachername("Abhishek");
	}

}
