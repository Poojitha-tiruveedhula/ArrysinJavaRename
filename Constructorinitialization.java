package com.operator;

public class Constructorinitilization {
	double length;
	double breadth;
	Rectangle()
	{
		length=10;
		breadth=20;
	}
	Rectangle(double a)
	{
		length=a;
		breadth=a;
	}
	Rectangle(length a,breadth b)
	{
		length=a;
		breadth=b;
	}
	double area()
	{
		return length*breadth;
	}
	public static void main(String[] args)
	{
		Rectangle obj1=new Rectangle();
		Rectangle obj2=new Rectangle();
		Rectangle obj3=new Rectangle();
		System.out.println("one argument rectangle area is"+obj1.area());
		System.out.println("two arguments rectangle area is"+obj2.area());
		System.out.println("three arguments rectangle area is"+obj3.area());
		

	}

}
