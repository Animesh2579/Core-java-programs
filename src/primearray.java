import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

class PrimeArray
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
out.println(" "+ar[i]);
int COUNT=0;
int me;
for(int i=0;i<size;i++)
 {
  me=ar[i];
  for(int j=1;j<=me;j++)
    {
     if(me%j!=0)
     ++COUNT;
    }
  }
out.println("Total Number of prime numbers in entered array="+COUNT);
}
}