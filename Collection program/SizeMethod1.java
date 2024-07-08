import java.util.*;
class SizeMethod1
{
	public static void main(String[] args) {
		List<Integer>list= Arrays.asList(2,3,1,4,1,3);
		System.out.println(list);             //[2, 3, 1, 4, 1, 3]
		
		Integer[]arr=new Integer[list.size()];
		for(int i=0;i<list.size();i++)
		{
			arr[i]=list.get(i);
		}
		System.out.println(Arrays.toString(arr));


	}
}
