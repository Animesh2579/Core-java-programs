import static java.lang.System.out;
class College
{
String collname;
int totalcourse;
long contactno;
College(String Snm,int tc,long cno)
{
collname=Snm;
totalcourse=tc;
contactno=cno;
}
public String toString()
{
return collname+" @@@ "+totalcourse+" @@@ "+contactno;
}
public void finalize()
{
out.println("memory is free!!!");
}
}
class MainClass
{
static public void main(String...ar)
{
out.println(new College("SGSITS",100,156));
System.gc();
}
}