import java.util.*;
class LinkedListMethod_RemoveFirstOccurence
{
	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		System.out.println(list);                                    //[10, 20, 30,10]        
		
	    boolean returnValue=list.removeFirstOccurrence(10);
	    System.out.println(returnValue);                            //true

		System.out.println(list);                            //[20, 30,10]
	}
}
