import java.util.Scanner;
import static java.lang.System.out;
class Palindrome
{
static public void main(String...ar)
{
Scanner sc=new Scanner(System.in);
out.println("Enter any word");
String str1=sc.next();
String rev="";
int len=str1.length();
for(int i=len-1;i>=0;i--)
rev=rev+str1.charAt(i);
if(str1.equals(rev))
out.println("it is palindrome");
else
out.println("It is not palindrome"); 
}
}