import java.util.Scanner;
import static java.lang.System.out;
class Upper
{
static public void main(String...ar)
{
Scanner sc=new Scanner(System.in);
out.println("Enter any word");
String str1=sc.next(); 
int len=str1.length();
int i;
char ch[]=new char[len];
for( i=0;i<len;i++)
{
 ch[i]=str1.charAt(i);
 if(i==0)
  {
  if(ch[i]>='a'&&ch[i]<='z')
  ch[i]=(char)((int)ch[i]-32);
  }
}
out.println("New word="+ch);
}
}																										