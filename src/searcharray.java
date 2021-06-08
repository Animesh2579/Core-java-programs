import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
class SearchArray
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
out.println("Enter element to be searched");
int key=sc.nextInt();
int FLAG=0;
int POS=0;
for(int i=0;i<size;i++)
 {
  if(ar[i]==key)
   {
    FLAG=1;
    POS=i+1;
    break;
   }
  }
if(FLAG==1)
 {
   out.println("Element found at position="+POS);
  }
else
out.println("Element not found");
}
}