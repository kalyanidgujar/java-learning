import java.util.*;
class LinkedListMethod_GetLast
{
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<>();
		list.add("Anandi");
		list.add("Shweta");
		list.add("Manasvi");
		System.out.println(list);                                  //[Anandi, Shweta, Manasvi]
		
		System.out.println("First element:"+list.getLast());      //Manasvi
	}
}
