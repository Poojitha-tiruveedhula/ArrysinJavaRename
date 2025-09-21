import java.util.*;
import java.util.Scanner;
public class DuplicateElementsUsingHashSet
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
HashSet<Integer>seen=new HashSet<>();
HashSet<Integer>duplicates=new HashSet<>();
for(int c:b)
{
if(!seen.add(c))
{
duplicates.add(c);
}}
for(int d: duplicates)
{
System.out.println(d+" ");
}
sc.close();
}}