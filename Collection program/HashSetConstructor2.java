import java.util.*;
class HashSetConstructor2
{
	public static void main(String[] args) {


		ArrayList<Integer>list=new ArrayList<>();

		for(int i=10;i<=50;i+=10)
		{
			list.add(i);
		}
		System.out.println(list);   
	    HashSet hs=new HashSet (list);
  
		System.out.println(hs);

	}
}