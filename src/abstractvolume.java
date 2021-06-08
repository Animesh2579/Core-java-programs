import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
abstract class Shape
{
abstract void volume();
abstract void show();
}
class Cone extends Shape
{
double volumecone;
void volume()
{
Scanner sc=new Scanner(System.in);
out.println("Enter radius of cone");
double radcone=sc.nextDouble();
out.println("Enter height of cone");
double htcone=sc.nextDouble();
volumecone=0.33*3.14*radcone*radcone*htcone;
}
void show()
{
out.println("Volume of cone="+volumecone);
}
}
class Cylinder extends Shape
{
double volumecylinder;
void volume()
{
Scanner sc=new Scanner(System.in);
out.println("Enter radius of Cylinder");
double radcylinder=sc.nextDouble();
out.println("Enter height of cone");
double htcylinder=sc.nextDouble();
volumecylinder=3.14*radcylinder*radcylinder*htcylinder;
}
void show()
{
out.println("Volume of Cylinder="+volumecylinder);
}
}
class Sphere extends Shape
{
double volumesphere;
void volume()
{
Scanner sc=new Scanner(System.in);
out.println("Enter radius of Sphere");
double radsphere=sc.nextDouble();
volumesphere=3.14*radsphere*radsphere*1.33;
}
void show()
{
out.println("Volume of Sphere="+volumesphere);
}
}
class MainAbstClass
{
public static void main(String...ar)
{
Scanner sc=new Scanner(System.in);
Shape ref[]={new Cone(),new Cylinder(),new Sphere()};
for(int i=0;i<ref.length;i++)
{
 ref[i].volume();
 ref[i].show();
}
}
}					