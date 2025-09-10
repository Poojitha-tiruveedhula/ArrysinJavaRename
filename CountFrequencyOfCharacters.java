import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
public class CountFrequencyOfCharacters
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
HashMap<Character,Integer>res=new HashMap<>();
for(char c:str.toCharArray())
{
if(c !=' ')
{
res.put(c,res.getOrDefault(c,0)+1);
}
}
for(char c:res.keySet())
{
System.out.println(c+":"+res.get(c));
}
}
}

