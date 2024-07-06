import java.util.*;
class AddMethodCollection
{
	public static void main(String[] args) {
		Set<Integer> arrayList=new HashSet<Integer>();
		System.out.println(arrayList.add(10));         //true
		System.out.println(arrayList.add(null));       //true
		System.out.println(arrayList.add(null));       //false 
		System.out.println(arrayList.add(null));       //false
		System.out.println();


		Set<Integer> set=new HashSet<Integer>();
		System.out.println(set.add(10));           //true
		System.out.println(set.add(10));           //false
		// System.out.println(set.add("30"));       //argument mismatch; String cannot be converted to Integer
		System.out.println(set.add(30));           //true
		System.out.println(set.add(40));           //true
		System.out.println(set.add(40));           //false
	}
}