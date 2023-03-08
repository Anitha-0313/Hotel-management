import java.util.StringTokenizer;
public class Menu {
String Name,Items,prices;
Menu(String name,String Item,String Prices)
{
Name = name;
Items = Item;
prices = Prices;
}
void Display()
{
StringTokenizer st = new StringTokenizer(Items,",");
StringTokenizer st2 = new StringTokenizer(prices,",");
System.out.println("Welcome to "+Name);
while(st.hasMoreElements()&& st2.hasMoreElements())
{
System.out.println(st.nextElement() +"\t"+st2.nextToken());
}
System.out.println();
}
}