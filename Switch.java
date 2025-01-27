class Switch
{
public static void main(String[] args)
{
String day="Tuesday";
String res="";
res=switch(day)
{
case "sunday","Monday" : yield "9am";
case "Tuesday","Wednesday" : yield "12pm";
default : yield "8am"; 
};
System.out.println(res);
}}
