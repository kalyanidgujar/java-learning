import java.util.*;
class ListMethod_Add
{
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(25);
		list.add(50);
		list.add(1,15);
		list.add(100);
		System.out.println(list);     //[10,15, 25, 50, 100]

	}
}