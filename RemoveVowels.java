import java.util.*;
import java.util.Scanner;
public class RemoveVowels
{
public static String removeVowels(String str)
{
String res=str.replaceAll("[AEIOUaeiou]","");
return res;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println(removeVowels(str));
}
}
