import java.util.*;
class VectorConstructorCapacity
{
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>(15);
          for(int i=10;i<=160;i+=10)
            v.addElement(i);
        System.out.println(v.capacity());
         
		
	}
}