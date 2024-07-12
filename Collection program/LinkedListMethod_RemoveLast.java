import java.util.*;
class LinkedListMethod_RemoveLast
{
	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);                                                    //[10, 20, 30]        
		
		System.out.println("Remove Last element"+list.removeLast());               //30
		System.out.println(list);                                                    //[10,20]
	}
}
