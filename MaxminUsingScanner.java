import java.util.Scanner;
import java.util.*;
class MaxminUsingScanner
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the  number of elements:");
    int n=sc.nextInt();
int[] a =new int[n];
System.out.println("enter the elements:");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
System.out.println("min:"+ a[0] + "max is:"+ a[a.length-1]);
}
}