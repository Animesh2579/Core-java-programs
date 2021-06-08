import java.util.regex.Pattern;
import java.util.regex.Matcher;
class FirstRegex
{
public static void main(String...ar)
 {
  Pattern pat=Pattern.compile("ram",Pattern.CASE_INSENSITIVE);
  Matcher mat=pat.matcher("animesh Patni ji ka bhakt hai");
  boolean suc=mat.find();
  if(suc)
  System.out.println("Jai ho");
  else
   System.out.println("Pakistan Murdabad");
 }
}