import java.util.*;
class ContainsAllMethod
{
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(40,50,10,20);
		System.out.println(list);
		List<Integer>list1=Arrays.asList(10,20,30);     
		System.out.println(list.containsAll(list1));    //false
		List<Integer>list2=Arrays.asList(40,50,20);
		System.out.println(list.containsAll(list2));
	}
}