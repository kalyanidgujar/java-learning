import java.util.*;
class ListMethod_Set
{
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);                  //[10, 20, 30, 40]

		System.out.println(list.set(1,70));        //20
		System.out.println(list);                 //[10, 70, 30, 40]    20 replace to 70
	}
}