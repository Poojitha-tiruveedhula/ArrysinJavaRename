class Student
{
int rollno;
int marks;
String name;
}
public class Enhancedforloop
{
public static void main(String[] args)
{
int i;
Student s1=new Student();
s1.name="lahari";
s1.rollno=1;
s1.marks=20;

Student s2=new Student();
s2.name="sushma";
s2.rollno=2;
s2.marks=19;

Student s3=new Student();
s3.name="pallavi";
s3.rollno=3;
s3.marks=19;

Student s4=new Student();
s4.name="poojitha";
s4.rollno=4;
s4.marks=18;

Student students[]=new Student[4];
students[0]=s1;
students[1]=s2;
students[2]=s3;
students[3]=s4;

for(Student a:students)
{
System.out.println(a.name + " : " +a.marks);
}
}
}


