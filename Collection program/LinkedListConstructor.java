import java.util.*;
class LinkedListConstructor
{
	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);  //[10, 20, 30]

		ArrayList<String>str=new ArrayList<Integer>(list);
		System.out.println(str);
	}
}