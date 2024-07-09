import java.util.*;
class ListMethod_AddAll
{
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	    System.out.println(list);                        //[1, 2, 3, 4,5]

	    ArrayList<Integer>arr=new ArrayList<>();
	    arr.add(10);
	    arr.add(20);
	    arr.add(30); 
	    System.out.println(arr);                         //[10, 20, 30]

	    list.addAll(2,arr);
	    System.out.println(list);                        //[1, 2, 10, 20, 30, 3, 4, 5]


		}
}