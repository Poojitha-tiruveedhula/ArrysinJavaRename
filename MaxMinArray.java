import java.util.*;
import java.util.Scanner;
public class MaxMinArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
int max=b[0];
int min=b[0];
for(int c:b)
{
if(c>max)max=c;
if(c<min)min=c;
}
System.out.println("max:"+max);
System.out.println("min:"+min);
}
}