import java.lang.*;
import java.util.*;
class arraystri1
{
public static void main(String[] args)
{
int arr[][]=new int[100][100];
int i,j;
System.out.println("enter the no of rows wanted:");
Scanner rs=new Scanner(System.in);
int xn=rs.nextInt();
System.out.println("enter the elements:");
for(i=1;i<=xn;i++)
{
for(j=1;j<=i;j++)
{
arr[i][j]=rs.nextInt();
}
}
System.out.println();
for(i=1;i<=xn;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(arr[i][j]+"\t");
}
System.out.println();
}
}
}