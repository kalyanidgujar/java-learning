import java.util.*;
class IteratorMethodExample
{
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=5;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println(list);                   //[5, 6, 7, 8, 9, 10]           


		//odd element in arraylist
		Iterator<Integer>itr=list.iterator();
		
		while(itr.hasNext())
		{
		   Integer odd=itr.next();
		   if(odd%2!=0)
		   	 System.out.println(odd);                //5 7 9

		}



		//or using eumeration if elemnet in sequenc order

		/*Vector<Integer>v=new Vector<>();
		for(int i=5;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);                 //[5, 6, 7, 8, 9, 10]

		Enumeration enumeration=v.elements();

        while(enumeration.hasMoreElements())
		{
			Integer odd=(Integer)enumeration.nextElement();
			System.out.println(odd);
			enumeration.nextElement();
		}*/


	}
}