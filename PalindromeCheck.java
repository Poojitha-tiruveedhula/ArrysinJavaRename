import java.util.*;
import java.util.Scanner;
public class PalindromeCheck
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String res=new StringBuilder(str).reverse().toString();
if(str.equals(res))
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}}