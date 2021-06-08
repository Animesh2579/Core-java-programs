import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
class VarArgAll 
{
 static void search(int...ar)
  {
   Scanner sc=new Scanner(System.in);
   int i;
   int FLAG=0;
   out.println("Enter element to be searched");
   int key=sc.nextInt();
   for(i=0;i<ar.length;i++)
    {
     if(ar[i]==key)
     FLAG=1;
    }
  if(FLAG==1)
  out.println("Element found");
  else
  out.println("Element not found");
 } 
static void sort(int...ar)
  {
   java.util.Arrays.sort(ar);
   for(int i=0;i<ar.legth;i++)
    {
     out.println(ar[i]);
    }
  }
static void add(int...ar)
  {
   int sum[]=0;
  }
static void eo1(int...ar)
  {}
static void prime(int...ar)
  {}
static void eo2(int...ar)
  {
   int EVEN=0;
   int ODD=0;
   for(int i=0;i<ar.length;i++)
    {
     if(ar[i]%2==0)
     ++EVEN;
     else
     ++ODD;
    }
 out.println("Total no. of even numbers="+EVEN);
 out.println("Total no. of odd numbers="+ODD);
 }
}
class Main
{
static public void main(String...ar)
{
Scanner sc=new Scanner(System.in);
out.println("Enter your choice");
out.println("1.To search an element");
out.println("2.To sort elements");
out.println("3.To add all elements");
out.println("4.To sort even and odd elements");
out.println("5.To find total no. of prime numbers");
out.println("6.To find out no. of even and odd elements");
out.println("7.To exit");
byte choice=sc.nextByte();
switch(choice)
{
case 1:VarArgAll.search(1,2,3,4,5,6,7,8,9,10);
           break;
case 2:VarArgAll.sort(10,8,2,6,4,5,3,9,1,5,4,6);
           break;
case 3:VarArgAll.add(1,2,3,4,5,6,7,8,9,10);
           break;
case 4:VarArgAll.eo1(1,2,3,4,5,6,7,8,9,10);
           break;
case 5:VarArgAll.prime(1,2,3,4,5,6,7,8,9,10);
           break;
case 6:VarArgAll.eo2(1,2,3,4,5,6,7,8,9,10);
           break;
case 7:System.exit(0);
           break;
default:
           out.println("Invalid choice");
}
}
} 
   