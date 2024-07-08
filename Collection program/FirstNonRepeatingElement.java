import java.util.*;
class FirstNonRepeatingElement
{
	public static void main(String[] args) {
		int []arr={1,2,3,1,2,4,5,4,2,5,6,6};
		System.out.println(Arrays.toString(arr));

		List<Integer>list=new ArrayList<>();
		for(Integer i:arr)
			list.add(i);
		Set<Integer>set=new LinkedHashSet<>(list);
         int max=Integer.MAX_VALUE;
         Integer max1=null;

		for(Integer i:set)
		{
			if(Collections.frequency(list,i)<max)
			{
                max=Collections.frequency(list,i);
                max1=i;
			}
			}
		  System.out.println(max1);

		}

	}