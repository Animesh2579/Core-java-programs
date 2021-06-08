import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
class SortArray
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
int temp;
for(int i=0;i<size;i++)
 {
   for(int j=0;j<size-1;j++)
    {
      if(ar[j]>ar[j+1])
       {
         temp=ar[j];
         ar[j]=ar[j+1];
         ar[j+1]=temp;
        }
    }
 }
out.println("Sorted Array:");
for(int i=0;i<size;i++)
out.println(" "+ar[i]);
}
}