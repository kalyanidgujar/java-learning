import java.util.*;
class VectorConstructor1
{
	public static void main(String[] args) {
		Vector<Integer>v=new Vector<>(5,10);
		System.out.println(v.capacity());              //5

		for(int i=10;i<=60;i+=10)
			v.addElement(i);
		System.out.println(v);                         //[10, 20, 30, 40, 50, 60]
		System.out.println(v.capacity());   //15

	}
}