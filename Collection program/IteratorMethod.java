import java.util.*;
class IteratorMethod
{
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		System.out.println(list);        //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		Iterator<Integer>abc=list.iterator();
		while(abc.hasNext())
		{
			Integer i=abc.next();
			if(i%2==0)
			{
				abc.remove();
			}
		}
		System.out.println(list);
	}
}