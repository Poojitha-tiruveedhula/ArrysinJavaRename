import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
class Pupil 
{
int age;
String name;
public Pupil(int age,String name)
{
this.age=age;
this.name=name;
}
public String toString()
{
return "student [age=" + age +", name=" +name+"]";
}
public class JavaComparator
{
public static void main(String[] args)
{
Comparator<Pupil>b=( c, d)->i.age>j.age?1:-1;
List<Pupil>n=new ArrayList<>();
n.add(new Pupil(14,"arya"));
n.add(new Pupil(31,"kiara"));
n.add(new Pupil(25,"myra"));
n.add(new Pupil(43,"meera"));
n.add(new Pupil(77,"aryan"));
Collections.sort(n);
for(Pupil x : n)
System.out.println(x);
}
}}