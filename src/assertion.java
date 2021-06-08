import static java.lang.System.out;
class Simple
{
 int var;
 void set(int var)
  {
   this.var=var;
  }
void show()
{
var=var*100;
assert(var==1000):"Bug FOund...";
out.println(var); 
}
}
class Assertion
{
static public void main(String...ar)
{
Simple ref=new Simple();
ref.set(20);
ref.show();
}
}