import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import static java.lang.System.out;
class DateConcept
{
static public void main(String...ar)
{
Date date=new Date();
out.println(date);
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a E z");
out.println(sdf.format(date));
DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
out.println(df.format(date));
DateFormat df1=DateFormat.getDateInstance(DateFormat.SHORT);
out.println(df1.format(date));
DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG);
out.println(df2.format(date));
}
}