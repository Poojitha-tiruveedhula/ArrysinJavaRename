import java.util.*;
import java.util.Scanner;
import java.util.LinkedHashSet;
public class RemovingDuplicates
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
LinkedHashSet<Integer>c=new LinkedHashSet<>();
for(int d:b)
{
c.add(d);
}
System.out.println(c);
}
}