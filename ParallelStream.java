import java.util.*;
import java.util.Scanner;
public class ParallelStream
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
List<Integer>list=new ArrayList<>();
for(int i=0;i<a;i++)
{
list.add(sc.nextInt());
}
int m=list.parallelStream()
      .mapToInt(Integer::intValue)
      .sum();
System.out.println(m);
}
}
      
