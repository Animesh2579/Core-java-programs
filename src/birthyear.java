import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
class BirthYear
{
static public void main(String...ar)
{
Scanner sc=new Scanner(System.in);
out.println("Enter age");
int age=sc.nextInt();
int value=78-age;
int year=value+1941;
out.println("Birthyear="+year);
}
}
