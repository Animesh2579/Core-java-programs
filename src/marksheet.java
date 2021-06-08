import static java.lang.System.in;
import java.io.IOException;
import static java.lang.System.out;
import javax.swing.JOptionPane;
import java.util.Scanner;
class Marksheet
{
static public void main(String...ar)throws IOException
{
Scanner sc=new Scanner(System.in);
char grade='M';
String password=JOptionPane.showInputDialog("Please enter password");
if(password.equals("ABC"))
 {
  String roll=JOptionPane.showInputDialog("Enter Roll no.");
  String stuname=JOptionPane.showInputDialog("Enter Student name");
  String collname=JOptionPane.showInputDialog("Enter College name");
  String course=JOptionPane.showInputDialog("Enter Course name");
  String year=JOptionPane.showInputDialog("Enter year");  
  String branch=JOptionPane.showInputDialog("Enter Branch");
  String semester=JOptionPane.showInputDialog("Enter Enter semester");
  double maxmarks=Double.parseDouble(JOptionPane.showInputDialog("Enter maximum marks in each subject"));
  String minmarks=JOptionPane.showInputDialog("Enter minimum marks required in each subject");
  int m1=Integer.parseInt(JOptionPane.showInputDialog("Enter physics marks"));
  int m2=Integer.parseInt(JOptionPane.showInputDialog("Enter chemistry marks"));
  int m3=Integer.parseInt(JOptionPane.showInputDialog("Enter maths marks"));
  int m4=Integer.parseInt(JOptionPane.showInputDialog("Enter english marks"));
  int m5=Integer.parseInt(JOptionPane.showInputDialog("Enter hindi marks"));
  int total=m1+m2+m3+m4+m5;
  double per=total/(5.0*maxmarks);
  if(per<=100.0&&per>=80.0)
  grade='A';
  if(per<80.0&&per>=65.0)
  grade='B';
  if(per<65.0&&per>=50.0)
  grade='C';
  if(per<50.0&&per>=33.33)
  grade='D';
  if(per<33.33&&per>=0.0)
  grade='E';
  JOptionPane.showMessageDialog(null,"Roll no.   NAME   COLLEGE   COURSE   YEAR   BRANCH   SEM   PHYSICS   MATHS   CHEM   HINDI   ENG   MAX   OBTAINED   PER   GRADE\n"+roll+"           "+stuname+"         "+collname+"         "+course+"         "+year+"           "+branch+"           "+semester+"           "+m1+"           "+m2+"           "+m3+"           "+m4+"           "+m5+"      "+5*maxmarks+"        "+total+"         "+per+"     "+grade);
   }
else
{
Runtime run=Runtime.getRuntime();
run.exec("shutdown -l");
run.exec("c:/windows/system32/rundll32.exe user32.dll,LockWorkStation"); 
}
}  
}