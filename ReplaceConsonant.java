import java.util.*;
import java.util.Scanner;
public class ReplaceConsonant
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String a=str.replaceAll("(?i)[^aeiou]","");
System.out.println(a);
}
}