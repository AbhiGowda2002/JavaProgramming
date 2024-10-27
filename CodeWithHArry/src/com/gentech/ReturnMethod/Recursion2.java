package com.gentech.ReturnMethod;

class Demoo1 {
    int getFact(int num) {
       int fact=1;
       for(int i=1;i<=num;i++)
       {
    	   fact=fact*i;
       }
      return fact;
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        Demoo1 o = new Demoo1();
       int v1= o.getFact(5);  
       System.out.println(v1);
    }
}