import java.util.*;
class IsEmptyMethod
{
	public static void main(String[] args) {
		Collection coll=null;
		// System.out.println(coll.isEmpty());   //NullPointerException

		coll=new ArrayList();
		System.out.println(coll.isEmpty());     //true

		List list=Arrays.asList(1,2,3);
		System.out.println(list.isEmpty());       //false
		//list.clear();
		// System.out.println(list.isEmpty());    //.UnsupportedOperationException
	}
}