import java.util.*;
class EnumerationExample
{
	public static void main(String[] args) {
		Vector list=new Vector();
		list.addElement(10);
		list.addElement("20");
		list.addElement(30);
		list.addElement("40");
		list.addElement("fifty");
		list.addElement(60);
		System.out.println(list);                       //[10, 20, 30, 40, fifty, 60]

		Enumeration enumeration=list.elements();
		Vector<Integer>list1=new Vector<>();
		while(enumeration.hasMoreElements())
		{
			Object obj=enumeration.nextElement();
			if(obj instanceof Integer)
			{
				Integer integer=(Integer)obj;
				list1.addElement(integer);
			}
		}
		System.out.println(list1);                        //[10, 30, 60]

	}
}