import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
class AddElements
{
static public void main(String...ar)
{
Scanner sc=new Scanner(System.in);
out.println("Enter elements of matrix ");
int ar1[][]=new int[3][];
ar1[0]=new int[1];
ar1[1]=new int[2];
ar1[2]=new int[3];
for(int i=0;i<3;i++)
 {
  for(int j=0;j<ar1[i].length;j++)
  ar1[i][j]=sc.nextInt();
 }
out.println(" matrix:");
for(int i=0;i<3;i++)
 {
  for(int j=0;j<ar1[i].length;j++)
   {
    out.print(" "+ar1[i][j]);
   }
 out.println();
 }
int SUM=0;
for(int i=0;i<3;i++)
 {
  for(int j=0;j<ar1[i].length;j++)
  SUM=SUM+ar1[i][j];
 }
out.println("Sum of all the elements of entered matrix="+SUM);
}
}