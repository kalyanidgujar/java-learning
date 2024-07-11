import java.util.*;
class ArrayListMethod_SubList
{
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Komal");
		list.add("Anandi");
		list.add("pallavi");
		list.add("praju");
		list.add("kalyani");
		list.add("Priya");

		System.out.println(list);
		List<String>list2=list.subList(3,5);
		System.out.println(list2);
	}
}