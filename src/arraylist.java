import java.util.ArrayList;
import static java.lang.System.out;
class ListConcept
{
static public void main(String...ar)
{
ArrayList list=new ArrayList();
list.add(34.33);
list.add("ani");
list.add("true");
out.println(list);
for(int i=0;i<list.size();i++)
out.println(list.get(i));
list.remove(2);
out.println(list);
ArrayList<Integer>list2=new ArrayList<Integer>();
list2.add(256);
list2.add(12546);
list2.add(332365245);
out.println(list2);
for(Integer data:list2)
out.println(data);
out.println("____________________________________________");
list2.forEach(m->out.println(m));
}
}