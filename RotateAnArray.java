import java.util.*;
import java.util.Scanner;
public class  RotateAnArray
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
int first=b[0];
for(int i=0;i<b.length-1;i++)
{
b[i]=b[i+1];
}
b[b.length-1]=first;
System.out.println(Arrays.toString(b));
}
}