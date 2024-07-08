//All in One
import java.util.*;
class UniqueElement
{
	public static void main(String[] args) {
		int []arr={1,2,3,2,3,4,5};
		System.out.println(Arrays.toString(arr));     //[1, 2, 3, 2, 3, 4, 5]

		List<Integer> list=new ArrayList<>();
		for(Integer i:arr)
			list.add(i);
		Set<Integer> set=new LinkedHashSet<>(list);  
		System.out.println(set);                       //[1, 2, 3, 4, 5]

		

	}
}