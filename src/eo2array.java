import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
class EO2
{
static public void main(String...argu)
{
Scanner sc=new Scanner(System.in);
out.println("Enter total no. elements");
int size=sc.nextInt();
int ar[]=new int[size];
for (int i=0;i<size;i++)
ar[i]=sc.nextInt();
out.println("Elements are:");
for(int i=0;i<size;i++)
out.println("\n"+ar[i]);
int EVEN=0;
int ODD=0;
for(int i=0;i<size;i++)
 {
  if(ar[i]%2==0)
  ++EVEN;
  else
  ++ODD; 
 }
out.println("Total Even no.="+EVEN);
out.println("Total Odd no.="+ODD);
}
}