import java.util.*;
class CollectionTo_ObjectArray
{
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5);
		//converting collection to array
		Object[]arr1=list.toArray();

		int[]arr3=new int[arr1.length];

		int index=0;
		for(Object i:arr1)
		{
			Integer j=(Integer)i;            //downcasting to Integer
			arr3[index++]=j.intValue();     //converting integer to int (unboxing)
		}




		System.out.println(Arrays.toString(arr3));
	}
}