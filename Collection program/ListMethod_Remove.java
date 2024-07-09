import java.util.*;
class ListMethod_Remove
{
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);                  //[10, 20, 30, 40]

		list.remove(2);
		System.out.println(list);                   //[10, 20, 40]

		
	}
}