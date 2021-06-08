import java.io.FileReader;
import java.util.Scanner;
import static java.lang.System.out;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class IOConcept
{
static public void main(String...ar)throws Exception
{
out.println("Enter data");
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String data=br.readLine();

Scanner sc=new Scanner(System.in);
out.println("Enter file name to save data");
String filename=sc.next();
out.println("Please specify path of the file");
String path=sc.next();
FileWriter fw=new FileWriter(path+"/"+filename,true);
fw.write(data);
fw.close();

FileReader fr=new FileReader(path+"/"+filename);
BufferedReader br1=new BufferedReader(fr);
String output=br1.readLine();
out.println(output);
}
}