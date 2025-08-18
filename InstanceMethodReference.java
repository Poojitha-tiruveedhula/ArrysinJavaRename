import java.util.*;
import java.util.Scanner;
public class InstanceMethodReference
{
public void display(String s)
{
System.out.println(s.toUpperCase());
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
InstanceMethodReference obj=new InstanceMethodReference();
int a=sc.nextInt();
sc.nextLine();
List<String>list=new ArrayList<>();
for(int i=0;i<a;i++)
{
list.add(sc.nextLine());
}
list.forEach(obj::display);
}
}