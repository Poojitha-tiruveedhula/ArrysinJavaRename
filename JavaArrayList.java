import java.util.ArrayList;
import java.util.Collection; 
import java.util.List;
public class JavaArrayList
{
public static void main(String[] args)
{
List<Integer> number = new ArrayList<Integer>(); 
number.add(1);
number.add(2);
number.add(3);
number.add(4);
number.add(5);
System.out.println(number.get(2));
System.out.println(number.indexOf(2));
//for(int a:number)
//{
//int b=(Integer)a;
//System.out.println(number);
//}
}
}

