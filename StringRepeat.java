import java.util.Scanner;
public class StringRepeat
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String x=sc.nextLine();
int n=sc.nextInt();

String a="";
for(int i=0;i<n;i++)
{
a+=x;
}
System.out.println(a);
}
}
