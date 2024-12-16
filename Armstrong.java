import java.util.Scanner;
import java.lang.Math;
public class Armstrong
{
public static void  main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int  num=sc.nextInt();   
int sum=0,remainder,number=num;
while(number!=0)
{
remainder =  number%10;
sum+=Math.pow(remainder,3);
number = number/10;
}
if(num==sum)
System.out.println("armstrong");
else
System.out.println("not a armstrong");
}
}  

