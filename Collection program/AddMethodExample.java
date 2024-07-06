import java.util.*;
class AddMethodExample
{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		System.out.println(list);             //[1, 2, 3, 4, 5]

		int[]arr={1,2,3,4,5,5,6,7,8};
		ArrayList<Integer>arrayList=new ArrayList<>();

		// Adding elements from array to ArrayList
		for(Integer i:arr)
			arrayList.add(i);

		System.out.println(arrayList);

		
	    ArrayList<Integer>arrayList1=new ArrayList<>();
	    for(int i=10;i<=200;i+=10)
	    {
	    	arrayList1.add(i);
	    }
	    System.out.println(arrayList1);

	}
}