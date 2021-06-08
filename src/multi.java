import static java.lang.System.out;
import java.util.Scanner;
class NewThread extends Thread
{
  String name;
  NewThread(String name)
  {
   this.name=name;
   start();
  }
 public void run()
 {
  Operations.set(name);
 }
}
class Operations
{
static void set(String nm)
 { 
  out.println(nm+"started");
   try
   {
    Thread.sleep(2000);
   }
   catch(InterruptedException ex)
   {
   }
  out.println(nm+"Ended");
 }
}
class MainClass
{
static public void main(String...ar)throws Exception
{
 NewThread th1=new NewThread("first thread");
 //th1.join();
 NewThread th2=new NewThread("second thread");
}
}