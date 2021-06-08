import static java.lang.System.out;
import java.util.StringJoiner;
class StrMethods
{
static public void main(String...ar)
{
StringBuilder sb=new StringBuilder("indore");
StringBuffer sb1=new StringBuffer("hatpipliya");
//sb.reverse();
//sb.delete(1,4);
sb.insert(2,"%%");
sb1.append(" beautiful ").reverse();
out.println(sb);
out.println(sb1);
StringJoiner ref=new StringJoiner("^");
ref.add("Mohit");
ref.add("Swati");
ref.add("Ragini");
out.println(ref);
//char array to String conversion
char ch[]={'b','a','h','u'};
String str1=new String(ch);
out.println(str1.toUpperCase());
//String array to char array conversion
String str2="hello indore ";
int VOWEL=0;
int len=str2.length();
char chr[]=new char[len];
for(int i=0;i<len;i++)
{
chr[i]=str2.charAt(i);
 if(chr[i]=='a'||chr[i]=='e'||chr[i]=='i'||chr[i]=='o'||chr[i]=='u')
  {VOWEL++;}
}
out.println("Total no. of vowels:"+VOWEL);
}}