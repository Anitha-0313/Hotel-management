import java.util.*;
public class HotelCollection {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
LinkedList<Menu> li = new LinkedList<>();
while(true)
{
System.out.println("1.Add New Hotel Details\n2.Display\n3.Dele
n4.exit");
switch(Integer.parseInt(sc.nextLine()))
{
case 1:
System.out.println("Enter Name:");
String name = sc.nextLine();
StringJoiner sj = new StringJoiner(",");
System.out.println("Enter Items Names: ");
while(true)
{
String tempitem = sc.nextLine();
if(tempitem.equalsIgnoreCase("STOP"))
{
break;
}
else
sj.add(tempitem);
}
StringTokenizer st = new StringTokenizer(sj.toString(),",");
StringJoiner sj2 =new StringJoiner(",");
while(st.hasMoreElements())
{
System.out.println("Enter Price of "+st.nextToken());
sj2.add(sc.nextLine());
}
li.add(new Menu(name, sj.toString(),sj2.toString()));
break;
case 2:
for(Menu m : li)
{
m.Display();
}
break;
case 3:
System.out.println("Enter Hotel Name to be deleted:");
String name1 = sc.nextLine();
Menu temp=null;
for(Menu m : li)
{
if(m.Name.equals(name1)) {
temp = m;
break;
}
}
li.remove(temp);
break;
case 4:
sc.close();
System.exit(0);
}
}
}
}