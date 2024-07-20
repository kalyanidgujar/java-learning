import java.util.*;
class TreeSetExampel1
{
	public static void main(String[] args) {
		TreeSet<Integer>set=new TreeSet<>();
		for(int i=10;i<=100;i+=10)
		{
			set.add(i);
		}
		System.out.println(set);
		System.out.println(set.first());        //10
		System.out.println(set.last());         //100
		System.out.println(set.pollFirst());    
		System.out.println(set);                //[20, 30, 40, 50, 60, 70, 80, 90, 100]
		System.out.println(set.pollLast());
		System.out.println(set);
	}
}