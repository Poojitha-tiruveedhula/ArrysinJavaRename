import java.util.*;
import java.util.stream.Collectors;
import java.util.Scanner;
public class FilterNumbers
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
List<Integer>filtered=list.stream()
                          .filter(x->x<10)
                          .collect(Collectors.toList());
System.out.println(filtered);
}
}