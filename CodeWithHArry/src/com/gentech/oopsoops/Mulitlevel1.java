package com.gentech.oopsoops;
class Employee
{
	Employee(String ename,String jobname)
	{
		System.out.println("Employee name:"+ename);
		System.out.println("Jobname is :"+jobname);
	}
}
class Department extends Employee
{
	String deptname;
	String asstname;
	String jbname;
	Department(String Deptname,String assitmanagername,String jobname)
	{
		super("Abhishek","Manager");
		deptname=Deptname;
		asstname=assitmanagername;
		jbname=jobname;
		
	}
}

public class Mulitlevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department o=new Department("Testing","Prabhakar","ASST Manager");
		
	}

}
