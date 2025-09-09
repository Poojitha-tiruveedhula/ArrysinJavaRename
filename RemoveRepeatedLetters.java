import java.util.Scanner;
import java.util.*;
public class RemoveRepeatedLetters
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
StringBuilder sb=new StringBuilder();
LinkedHashSet<Character> res=new LinkedHashSet<>();
for(char c:str.toCharArray())
{
res.add(c);
}
for(char c:res)
{
sb.append(c);
}
System.out.println(sb.toString());
sc.close();
}}
