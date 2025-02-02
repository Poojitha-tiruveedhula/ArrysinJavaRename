import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;
public class JavaStreamUsage
{
public static void main(String[] args)
{
List<Integer>a=Arrays.asList(3,5,1,2,8);
//Stream<Integer>b = a.stream();
//Stream<Integer>c = b.filter(m->m%2==0);
//Stream<Integer> d = c.map(m->m*2);
//int x=d.reduce(0,(p,q)->p+q);

int n=a.stream()
        .filter(m->m%2==0)
         .map(m->m*2)
         .reduce(0,(e,f)->e+f);
System.out.println(n);
//System.out.println(x);
//d.forEach(m->System.out.println(m));
}
}
