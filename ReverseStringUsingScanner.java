import java.util.Scanner;
public class ReverseStringUsingScanner
{
public static void main(String[] args)
{
int i;
String temp="";
Scanner sc=new Scanner(System.in);
String x=sc.nextLine();
for(i=x.length()-1;i>=0;i--)
temp+=x.charAt(i);
{
System.out.println(temp);
}
}
}
