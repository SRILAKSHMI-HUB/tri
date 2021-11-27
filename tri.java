import java.util.Scanner;
public class tri
{
public static void main(String args[])
{
int x,y,z;
Scanner s=new Scanner(System.in);
x=s.nextInt();
y=s.nextInt();
z=s.nextInt();

if(x==y && y==z)
{
System.out.println("Equilateral triangle");
}
else if(x==y || y==z || z==x)
{
System.out.println("Isosceles triangle");
}
else if(x==y && x!=z && y!=z)
{
System.out.println("Scalene triangle");
}
else
{
System.out.println("Invalid");
}
}
}
