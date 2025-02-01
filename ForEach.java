import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class ForEach
{
public static void main(String[] args)
{
List<Integer>a=Arrays.asList(3,5,1,2,8);
a.forEach(n->System.out.println(n));
}
}
