import static java.lang.System.out;
class Strop
{
static public void main(String...ar)
{
String str="Indore";
out.println(str.toUpperCase());
String str1="PUNE";
out.println(str1.toLowerCase());
String str11="     Sammed Shikharji        ";
out.println(str11);
out.println(str11.trim());
out.println("length:"+str11.length());
String str2="Live and let live";
out.println(str2.endsWith("me"));
out.println(str2.startsWith("Li"));
out.println(str2.indexOf('i'));
String str3="Epic Hero";
out.println(str3.replace('E','e'));
out.println(str3.replace("Epic","Arjun"));
String str4="check it";
str4.toUpperCase();
out.println(str4);
out.println(str4.toUpperCase());
}
}