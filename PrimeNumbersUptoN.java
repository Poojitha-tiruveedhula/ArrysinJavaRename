import java.util.*;
import java.util.Scanner;
public class PrimeNumbersUptoN
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=2;i<=a;i++)
{
boolean isPrime=true;
for(int j=2;j*j<=i;j++)
{
if(i%j==0)
{
isPrime=false;
break;
}
}
if(isPrime)
{
System.out.print(i+" ");
}
}
}}