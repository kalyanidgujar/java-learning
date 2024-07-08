import java.util.*;
class SizeMethod
{
	public static void main(String[] args) {
		Collection<Integer>coll=new ArrayList<>();
		coll.add(10);
		System.out.println(coll.size()); //1
		coll.add(20);
	    coll.add(30);
	    coll.add(40);
	    System.out.println(coll.size());  //4

	}
}
