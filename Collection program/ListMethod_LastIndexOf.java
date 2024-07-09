import java.util.*;
class ListMethod_LastIndexOf
{
	public static void main(String[] args) {
		List<String>list=new LinkedList<>();
		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("20");

		System.out.println(list);                      //[10, 20, 30, 40, 20]         

		System.out.println(list.lastIndexOf("20"));      //4

	}
}