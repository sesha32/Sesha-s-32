import java.lang.*;
import java.util.*;
class sentinalquadratic
{
public static void main(String[] args)
{
double a,b,c,r1,r2,determinant;
Scanner rs=new Scanner(System.in);
System.out.println("enter the values of a,b,c:");
a=rs.nextDouble();
b=rs.nextDouble();
c=rs.nextDouble();
determinant=(b*b)-(4*a*c);
if(determinant>0)
{
r1=(-b+(Math.sqrt(determinant))/(2*a));
r2=(-b-(Math.sqrt(determinant))/(2*a));
System.out.println("root1="+r1+"\n root2="+r2);
}
if(determinant==0)
{
r1=(-b)/(2*a);
r2=(-b)/(2*a);
System.out.println("Roots are equal");
System.out.println("root1="+r1+"\nroot2="+r2);
}
if (determinant<0)
{
System.out.println("Roots are imaginary");
}
}
}