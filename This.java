class Hi
{
private int age;
private String name;

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

public class This
{
public static void main(String[] args)throws ClassNotFoundException
{
Hi obj=new Hi();
obj.setAge(10);
obj.setName("ayra");
System.out.println(obj.getName()+":"+obj.getAge());
}
}