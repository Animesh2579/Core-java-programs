import static java.lang.System.out;
class Base<anu,ani,oye>
{
anu var1;
ani var2;
oye var3;
void set(anu a,ani b,oye c)
 {
  var1=a;
  var2=b;
  var3=c;
 }
void show()
 {
  out.println(var1+" "+var2+" "+var3);
 }
}
class Sample
{
static public void main(String...ar)
{
Base<Integer,String,Boolean> ref=new Base<Integer,String,Boolean>();
ref.set(12,"abc",true);
ref.show();
ref.set(66.6,'a',10);
ref.show();
}
}