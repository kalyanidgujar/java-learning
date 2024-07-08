import java.util.*;
class NonRepeatingElement
{
	public static void main(String[] args) {
		int []arr={1,2,3,1,2,3,4,5};
		System.out.println(Arrays.toString(arr));

		List<Integer>list=new ArrayList<>();
		for(Integer i:arr)
			list.add(i);
		Set<Integer>set=new LinkedHashSet<>(list);
		for(Integer i:set)
		{
			if(Collections.frequency(list,i)==1)
				System.out.println(i);
		}
	}
}

/*
[1, 2, 3, 1, 2, 3, 4, 5]
4
5
*/