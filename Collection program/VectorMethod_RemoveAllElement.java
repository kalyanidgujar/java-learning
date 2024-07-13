import java.util.*;
class VectorMethod_RemoveAllElement
{
	public static void main(String[] args) {
		Vector<Integer>list=new Vector<>();
		for(int i=10;i<=50;i+=10)
			list.addElement(i);
		System.out.println(list);               //[10, 20, 30, 40, 50]
		list.removeAllElement(list);

		System.out.println(list);             //[10, 30, 40, 50]

	}
}