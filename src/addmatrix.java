import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
class AddMatrix
{
static public void main(String...ar)
{
Scanner sc=new Scanner(System.in);
out.println("Enter elements of matrix 1");
int ar1[][]=new int[3][];
ar1[0]=new int[1];
ar1[1]=new int[2];
ar1[2]=new int[3];
for(int i=0;i<3;i++)
 {
  for(int j=0;j<ar1[i].length;j++)
  ar1[i][j]=sc.nextInt();
 }
out.println("Enter elements of matrix 2");
int ar2[][]=new int[3][];
ar2[0]=new int[1];
ar2[1]=new int[2];
ar2[2]=new int[3];
for(int i=0;i<3;i++)
 {
  for(int j=0;j<ar1[i].length;j++)
  ar2[i][j]=sc.nextInt();
 }
out.println("first matrix:");
for(int i=0;i<3;i++)
 {
  for(int j=0;j<ar1[i].length;j++)
   {
    out.print(" "+ar1[i][j]);
   }
 out.println();
 }
out.println("Second matrix:");
for(int i=0;i<3;i++)
 {
  for(int j=0;j<ar2[i].length;j++)
   {
    out.print(" "+ar2[i][j]);
   }
 out.println();
 }
int ar3[][]=new int[3][];
ar3[0]=new int[1];
ar3[1]=new int[2];
ar3[2]=new int[3];
for(int i=0;i<3;i++)
 {
  for(int j=0;j<ar3[i].length;j++)
  ar3[i][j]=ar1[i][j]+ar2[i][j];
 }
out.println("Addition of both matrix: ");
for(int i=0;i<3;i++)
 {
  for(int j=0;j<ar2[i].length;j++)
   {
    out.print(" "+ar3[i][j]);
   }
 out.println();
 }
}
}