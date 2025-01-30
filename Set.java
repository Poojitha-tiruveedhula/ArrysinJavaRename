import java.util.ArrayList;
import java.util.Collection; 
import java.util.List;
import java.util.HashSet;
//import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class Set
{
public static void main(String[] args)
{
Collection<Integer> number = new TreeSet<Integer>(); 
number.add(1);
number.add(2);
number.add(3);
number.add(2);
number.add(5);
Iterator<Integer> c = number.iterator();
while(c.hasNext())
System.out.println(c.next());
//for(int a:number)
//{
//System.out.println(a);
//}
}
}

