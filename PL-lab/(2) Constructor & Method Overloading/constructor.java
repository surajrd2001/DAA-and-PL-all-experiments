import java.util.Scanner;
class Area{
double area;
Area(double l , double h){
 area = 0.5*l*h;
}
Area(int l , int h){
 area = l*h;
}
Area(int a)
{
 area = a*a;
}
Area(double r)
{
 area = 3.14 * r * r;
}
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("1. Sqaure");
 System.out.println("2. Rectangle");
 System.out.println("3. Circle");
 System.out.println("4. Triangle");
 System.out.println("Enter your choice");

 int k = sc.nextInt();
 switch(k)
 {
 case 1 : System.out.println("enter side : ");
 int side = sc.nextInt();
 Area a = new Area(side);
 System.out.println("Area of square is : "+ a.area);
 break;
 case 2 : System.out.print("enter length : ");
 int len = sc.nextInt();
 System.out.print("enter width : ");
 int wid = sc.nextInt();
 Area b = new Area(len, wid);
 System.out.println("Area of Rectangle is : "+ b.area);
 break;
 case 3 : System.out.println("enter side : ");
 double rad = sc.nextDouble();
 Area c = new Area(rad);
 System.out.println("Area of circle is : "+ c.area);
 break;
 case 4 : System.out.print("enter height : ");
 double he = sc.nextDouble();
 System.out.print("enter base : ");
 double base = sc.nextDouble();
 Area d = new Area(he, base);
 System.out.println("Area of Triangle is : "+ d.area);
 break;
 default : System.out.println("Enter valid choice");
 break;
 }
}
}