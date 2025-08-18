import java.util.*;
import java.util.Scanner;
public class StaticMethodReference
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
sc.nextLine();
List<String>list=new ArrayList<>();
for(int i=0;i<a;i++)
{
list.add(sc.nextLine());
}
list.forEach(System.out::println);
}
}