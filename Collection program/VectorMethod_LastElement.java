import java.util.*;
class VectorMethod_LastElement
{
	public static void main(String[] args) {
		Vector<Integer>list=new Vector<>();
		for(int i=10;i<=100;i+=10)
			list.addElement(i);
		System.out.println(list);               //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

		System.out.println(list.lastElement());   //100

	}
}