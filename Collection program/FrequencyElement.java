import java.util.*;
class FrequencyElement
{
	public static void main(String[] args) {
		int []arr={1,2,3,4,1,2,4,5};
		System.out.println(Arrays.toString(arr));
		List<Integer>list=new ArrayList<>();
		for(Integer i:arr)
			list.add(i);
		Set <Integer>set=new LinkedHashSet<>(list);
		for(Integer i:set)
			System.out.println(i+":"+Collections.frequency(list,i));
	}
}

/*[1, 2, 3, 4, 1, 2, 4, 5]
1:2
2:2
3:1
4:2
5:1
*/