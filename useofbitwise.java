import java.lang.*;
import java.util.*;
class useofbitwise
{
public static void main(String args[])
{
System.out.println("enter a:");
Scanner rs=new Scanner(System.in);
int a=rs.nextInt();
int b=30,c=100;
if(a>b && a>c)
{
System.out.println("the given number is largest");
}
if(a>b || a>0)
{
System.out.println("the number is not 0");
}
}
}