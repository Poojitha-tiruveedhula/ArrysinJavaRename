import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class MapFilterReduce
{
public static void main(String[] args)
{
List<Integer>a=Arrays.asList(3,5,1,2,8);
Stream<Integer>sortedValues=a.stream()
.filter(n->n%2==0)
.sorted();
sortedValues.forEach(n->System.out.println(n));
//Predicate<Integer>b=n->n%2==0;
//Function<Integer,Integer>c=n->n*2;
//{
//public Integer apply(Integer n)
//{
//return n*2;
//}
//};
//int x=a.stream()
//.filter(n->n%2==0)
//.map(c)
//.reduce(0,(y,z)->y+z);
//System.out.println(x);
}
}