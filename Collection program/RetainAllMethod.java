import java.util.*;
class RetainAllMethod
{
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		for(int i=10;i<=100;i+=10)
		{
			list.add(i);
		}
		System.out.println(list);                    //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

		List<Integer>list1=new ArrayList<>();
		for(int i=10;i<=50;i+=10)
			list1.add(i);

		System.out.println(list1);                   //[10, 20, 30, 40, 50]
		System.out.println(list.retainAll(list1));   //true
		System.out.println(list);                    //[10, 20, 30, 40, 50]

	}
}