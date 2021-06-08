import static java.lang.System.out;
class Simple
{
static int var;
void set(int var)
 {
  this.var=var;
 }
static void show()
 {
 out.println("VAR="+var);
  }
}
class OOPMain
{
static public void main(String...ar)
 {
  Simple ref=new Simple();
  ref.set(100);
  ref.show();
  Simple ref1=new Simple();
  ref1.set(200);
  ref1.show();
  ref.show();
}
}