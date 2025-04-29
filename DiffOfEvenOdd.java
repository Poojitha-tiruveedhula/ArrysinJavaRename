import java.util.Scanner;
public class DiffOfEvenOdd
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int arr[] =new int[a];
for(int i=0;i<a;i++)
{
arr[i]=sc.nextInt();
}
int b=0;
int c=0;
for(int i=0;i<a;i++)
{

if(i%2==0)
{
b+=arr[i];
}
else
{
c+=arr[i];
}
}
int m=b-c;
System.out.print(m);
}
}