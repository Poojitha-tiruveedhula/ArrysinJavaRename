import java.util.*;
import java.util.Scanner;
public class MissingNumber
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
int n=a+1;
int totalsum=n*(n+1)/2;
int sum=0;
for(int num:b)
{
sum=sum+num;
}
System.out.println(totalsum-sum);
}
}