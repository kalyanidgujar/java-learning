import java.util.*;
class ContainsMethod
{
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(40,50,20,30,10);
		System.out.println(list.contains(40));           //true
		System.out.println(list.contains(70));           //false
		System.out.println(list.contains("70"));         //false

		System.out.println(list);

	   TreeSet<Integer>set=new TreeSet<>(list);
	   System.out.println(set);                      //[10, 20, 30, 40, 50]
	   System.out.println(set.contains(10));         //true
	   System.out.println(set.contains(30));         //true
	   System.out.println(set.contains("70"));
	}
}