class Hi
{
private int age;
private String name;

public Hi()
{
age=12;
name="pooja";
}

public Hi(int a,String n)
{
age=a;;
name=n;
}



public int getAge()
{
return age;
}

public void setAge(int age)
{
this.age=age;
}

public String getName()
{
return name;
}

public void setName(String name)
{
this.name=name;
}
}

public class Parametarizedconstructor
{
public static void main(String[] args)
{
Hi obj=new Hi();
System.out.println(obj.getName()+":"+obj.getAge());
//System.out.println(obj.getName()+":"+obj.getAge());

obj.setAge(20);
obj.setName("priya");
System.out.println(obj.getName()+":"+obj.getAge());
}
}