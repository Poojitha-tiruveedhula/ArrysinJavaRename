import java.util.Scanner;
public class FibonacciSeries
{
public static void main(String[] arsg)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0,b=1;
for(int i=1;i<=n;i++)
{
System.out.print(a + " ");
int next=a+b;
a=b;
b=next;
}
sc.close();
}
}