import java.util.*;
class TreeSetExampel2
{
	public static void main(String[] args) {
		TreeSet<Integer>set=new TreeSet<>();
		for(int i=10;i<=100;i+=10)
		{
			set.add(i);
		}
		System.out.println(set);             //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		System.out.println(set.higher(20));   //30
		System.out.println(set.lower(20));    //10
		System.out.println(set.floor(43));    //40
		System.out.println(set.ceiling(46));   //50

		System.out.println(set.subSet(30,70));   //[30, 40, 50, 60]
		
	}
}