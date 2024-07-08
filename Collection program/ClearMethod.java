import java.util.*;
class ClearMethod
{
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		System.out.println(list.isEmpty());   //true

		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println(list.isEmpty());   //false
		list.clear();
		System.out.println(list.isEmpty());   //true
	}
}