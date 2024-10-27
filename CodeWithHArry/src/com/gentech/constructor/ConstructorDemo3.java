package com.gentech.constructor;
class employee
{
	String employeename;
	int age;
}
class department
{
	String departmentname;
	int deptid;
}
class insurance
{
	String insurancename;
	int id;
}

public class ConstructorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee o1=new employee();
		o1.employeename="santosh";
		o1.age=22;
		System.out.println(o1.employeename);
		System.out.println(o1.age);
		
		department o2=new department();
		o2.departmentname="Manufacturing";
		o2.deptid=1222;
		System.out.println(o2.departmentname);
		System.out.println(o2.deptid);
		
		insurance o3=new insurance();
		o3.insurancename="jeevan";
		o3.id=212;
		System.out.println(o3.insurancename);
		System.out.println(o3.id);
	}
}
