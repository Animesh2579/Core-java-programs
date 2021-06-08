import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
class AddArray
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
int SUM=0;
for(int i=0;i<size;i++)
SUM=SUM+ar[i];
out.println("Sum of array elements="+SUM);
}
}