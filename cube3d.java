import java.lang.*;
import java.util.*;
class cube3d
{
public static void main(String args[])
{
int arr3d[][][]=new int[20][20][20];
int i,j,k,n;
System.out.println("enter the no of rows:");
Scanner rs=new Scanner(System.in);
n=rs.nextInt();
System.out.println("enter the elements:");
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
for(k=1;k<=n;k++)
{
arr3d[i][j][k]=rs.nextInt();
}
}
}
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
for(k=1;k<=n;k++)
{
System.out.print(arr3d[i][j][k]+"\t");
}
}
System.out.println();
}
}
}