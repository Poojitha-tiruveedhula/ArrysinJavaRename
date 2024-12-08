package com.helloworld; 
class Reversestring
{
public static void main(String[] args)
{
String original= "college";
String temp = " ";
for(int i=original.length()-1;i>=0;i--)
temp+=original.charAt(i);
System.out.println(temp);
}
}
