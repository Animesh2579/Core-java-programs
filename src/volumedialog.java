import javax.swing.JOptionPane;
import static java.lang.System.out;
class VolumeDialog
{
static public void main(String...ar)
 {
  float PI=3.1412f;
  int key=Integer.parseInt( JOptionPane.showInputDialog("....VOLUME CALCULATOR....\nEnter your choice...\n1.Sphere\n2.Cone\n3.Cylinder\n4.Exit"));
  switch(key)
   {
    case 1:
    float rads=Float.parseFloat( JOptionPane.showInputDialog("Enter radius of sphere"));
    float volumes=(4/3)*PI*rads*rads*rads;
    JOptionPane.showMessageDialog(null,"Volume of sphere="+volumes);
    String output=String.format("%.2f",volumes);
    break;
    case 2:
    float radco=Float.parseFloat( JOptionPane.showInputDialog("Enter radius of cone"));
    float htco=Float.parseFloat( JOptionPane.showInputDialog("Enter height of cone"));
    float volumeco=(float)0.33*radco*htco*radco*PI;
    JOptionPane.showMessageDialog(null,"Volume of Cone="+volumeco);
    break;
    case 3:
    float radcy=Float.parseFloat( JOptionPane.showInputDialog("Enter radius of cylinder"));
    float htcy=Float.parseFloat( JOptionPane.showInputDialog("Enter height of cylinder"));
    float volumecy=(float)radcy*radcy*PI*htcy;
    JOptionPane.showMessageDialog(null,"Volume of Cylinder="+volumecy);
    break;
    case 4:
    System.exit(0);
    default:
    JOptionPane.showMessageDialog(null,"Invalid Choice");
   }
  }
}