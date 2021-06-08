import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
class Diagonal
{
static public void main(String...arg)
{
Scanner sc=new Scanner(System.in);
out.println("Enter total no. of rows and column for square matrix");
int rows=sc.nextInt();
int col=sc.nextInt();
int ar[][]=new int[rows][col];
out.println("Enter elements");
for(int i=0;i<rows;i++)
 {
   for(int j=0;j<col;j++)
   ar[i][j]=sc.nextInt();
 }
out.println("Elements are:");
for(int i=0;i<rows;i++)
 {
   for(int j=0;j<col;j++)
    {
     out.print("  "+ar[i][j]);
    }
  out.println();
 }
int DIA=0;
for(int i=0;i<rows;i++)
 {
   for(int j=0;j<col;j++)
    {
      if(i==j||i+j==rows-1)
      DIA=DIA+ar[i][j];
    }
 }
out.println("Sum of diagonal elements of entered matrix="+DIA);
}
}