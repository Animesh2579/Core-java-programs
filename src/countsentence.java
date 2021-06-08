import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
class Count
{
static public void main(String...ar)
{
Scanner sc=new Scanner(System.in); 
out.println("Enter any sentence");
String sen=sc.nextLine();
int VOWEL=0;
int CONSONANT=0;
int NUMERIC=0;
int SYMBOLS=0;
int SPACES=0;
int len=sen.length();
char ch[]=new char[len];
for(int i=0;i<len;i++)
 { 
  ch[i]=sen.charAt(i);
  if(ch[i]=='a'||ch[i]=='A'||ch[i]=='e'||ch[i]=='E'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U')
  VOWEL++;
  if(ch[i]>='0'&&ch[i]<='9')
  NUMERIC++;
  if(ch[i]==' ') 
  SPACES++;
  if(ch[i]>=0&&ch[i]<=31||ch[i]>=33&&ch[i]<=47||ch[i]>=58&&ch[i]<=64||ch[i]>=91&&ch[i]<=96||ch[i]>=123&&ch[i]<=127)
  SYMBOLS++;
  if(ch[i]>=66&&ch[i]<=68||ch[i]>=70&&ch[i]<=72||ch[i]>=74&&ch[i]<=78||ch[i]>=80&&ch[i]<=84||ch[i]>=86&&ch[i]<=90||ch[i]>=98&&ch[i]<=100||ch[i]>=102&&ch[i]<=104||ch[i]>=106&&ch[i]<=110||ch[i]>=112&&ch[i]<=116||ch[i]>=118&&ch[i]<=122)
  CONSONANT++;
 }
out.println("No.of vowels="+VOWEL);
out.println("No. of numericals="+NUMERIC);
out.println("No.of space="+SPACES);
out.println("No.of Special Symbols="+SYMBOLS);
out.println("No.of consonants="+CONSONANT);
}
}