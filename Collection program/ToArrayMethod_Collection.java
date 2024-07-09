import java.util.*;
class ToArrayMethod_Collection
{
	public static void main(String[] args) {
		int[]arr={1,2,3,4,5};
		System.out.println(Arrays.toString(arr));  //[1, 2, 3, 4, 5]

		List<Integer> list=new ArrayList<>();
		for(Integer i:arr)
			list.add(i);
		System.out.println(list);                  //[1, 2, 3, 4, 5]
		Object[]arr1=list.toArray();
		System.out.println(Arrays.toString(arr1));   //[1, 2, 3, 4, 5]
	}
}