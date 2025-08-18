import java.util.*;
import java.util.Scanner;
import java.util.function.Supplier;
class Brand
{
private String name;
Brand()
{
this.name="unknown";
System.out.println(name);
}
Brand(String name)
{
this.name=name;
System.out.println(name);
}
}
public class ConstructorReference
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Supplier<Brand>sup=Brand::new;
Brand b=sup.get();
String name=sc.nextLine();
Supplier<Brand>parameter=()->new Brand(name);
Brand c=parameter.get();
}
}



