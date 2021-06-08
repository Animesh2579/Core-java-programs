 import javax.swing.JOptionPane;
import static java.lang.System.out;
class VehicleDialog
{
static public void main(String...ar)
 {
  double average=Double.parseDouble(JOptionPane.showInputDialog("Enter average of vehicle"));
  double kmone=Double.parseDouble(JOptionPane.showInputDialog("Enter how many km petrol run in one day"));
  double fuel=Double.parseDouble(JOptionPane.showInputDialog("Enter total fuel filled in vehicle"));
  double days=(fuel*average)/kmone;
  JOptionPane.showMessageDialog(null,"Total days vehicle can run(in km)="+days);
}
}
