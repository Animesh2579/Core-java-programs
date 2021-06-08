import javax.swing.JOptionPane;
import static java.lang.System.out;
class AreaDialog
{
static public void main(String...ar)
 {
  float PI=3.1412f;
  int key=Integer.parseInt( JOptionPane.showInputDialog("....AREA CALCULATOR....\nEnter your choice...\n1.Circle\n2.Triangle\n3.Rectangle\n4.Exit"));
  switch(key)
   {
    case 1:
    float rad=Float.parseFloat( JOptionPane.showInputDialog("Enter radius of circle"));
    float area=PI*rad*rad;
    JOptionPane.showMessageDialog(null,"Area of circle="+area);
    break;
    case 2:
    float base=Float.parseFloat( JOptionPane.showInputDialog("Enter base of triangle"));
    float ht=Float.parseFloat( JOptionPane.showInputDialog("Enter height of triangle"));
    float areat=(float)0.5*base*ht;
    JOptionPane.showMessageDialog(null,"Area of Triangle="+areat);
    break;
    case 3:
    float length=Float.parseFloat( JOptionPane.showInputDialog("Enter length of rectangle"));
    float breadth=Float.parseFloat( JOptionPane.showInputDialog("Enter breadth of triangle"));
    float arear=(float)length*breadth;
    JOptionPane.showMessageDialog(null,"Area of Rectangle="+arear);
    break;
    case 4:
    System.exit(0);
    default:
    JOptionPane.showMessageDialog(null,"Invalid Choice");
   }
  }
}