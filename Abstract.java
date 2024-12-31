abstract class Bike
{
public abstract void run();
public abstract void jump();

public void ride()
{
System.out.println("riding");
}
}

abstract class Cycle extends Bike
{
public void run()
{
System.out.println("running");
}
}

class Motor extends Cycle
{
public void jump()
{
System.out.println("jumping");
}
}

public class Abstract
{
public static void main(String[] args)
{
Bike a=new Motor();
a.run();
a.jump();
a.ride();
}
}