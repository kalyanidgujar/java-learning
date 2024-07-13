import java.util.*;
class VectorConstructor
{
	public static void main(String[] args) {
		 LinkedList<Integer> list = new LinkedList<>();
          list.add(10);
          list.add(20);
        
        // Create a Vector and initialize it with the elements from the Collection
        Vector<Integer> vector = new Vector<>(list);

        // Print the elements of the Vector
        System.out.println("Vector elements:"+list);      //Vector elements:[10, 20]

         
		
	}
}