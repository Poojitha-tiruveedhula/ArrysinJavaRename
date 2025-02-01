import java.util.Map;
import java.util.HashMap;
public class MapJava
{
public static void main(String[] args)
{
Map<String,Integer>a=new HashMap();
a.put("kyra",10);
a.put("myra",30);
a.put("kriya",20);
a.put("priya",40);
a.put("kiara",30);
a.put("priya",20);
//System.out.println(a.get("kyra"));
//System.out.println(a.getKey());
System.out.println(a.keySet());
for(String key:a.keySet())
{
System.out.println(key + ":"  + a.get(key));
}
}
}

 