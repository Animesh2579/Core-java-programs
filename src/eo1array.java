import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
class EO1
{
static public void main(String...argu)
{
Scanner sc=new Scanner(System.in);
out.println("Enter total no. elements");
int size=sc.nextInt();
int ar[]=new int[size];
for (int i=0;i<size;i++)
ar[i]=sc.nextInt();
java.util.Arrays.sort(ar);
out.println("Elements are:");
for(int i=0;i<size;i++)
out.println(" "+ar[i]);
out.println("Even elements are:");
for(int i=0;i<size;i++)
 {
  if(ar[i]%2==0) 
  out.print(" "+ar[i]); 
 }
out.println("");
out.println("Odd elements are:");
for(int i=0;i<size;i++)
 {
  if(ar[i]%2!=0) 
  out.print(" "+ar[i]); 
 }
}
}