import java.util.*;
class IteratorMethodCollection
{
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("Welcome");
		list.add("to");
		list.add("java");
		System.out.println(list);                 //[Welcome, to, java]

		Iterator<String>itr=list.iterator();

		while(itr.hasNext())                               
		{
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(list);                    //[Welcome, to]
		
	}
}