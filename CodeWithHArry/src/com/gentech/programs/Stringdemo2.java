package com.gentech.programs;
public class Stringdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="abhishek abhi";
		name=name.replace(' ','_');
		System.out.println(name);
		System.out.println("--------------------");
		
		String letter="Dear <|name|> thanks a lot";
		letter=letter.replace("<|name|>","ABhishek");
		System.out.println(letter);
		
	}

}
