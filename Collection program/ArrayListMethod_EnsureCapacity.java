import java.util.*;
class ArrayListMethod_EnsureCapacity
{
	public static void main(String[] args) {
		// Creating object of ArrayList<Integer> 
            ArrayList<Integer> arrlist = new ArrayList<Integer>(); 
  
            // adding element to arrlist 
            arrlist.add(10); 
            arrlist.add(20); 
            arrlist.add(30); 
            arrlist.add(40); 
  
            // Print the ArrayList 
            System.out.println("ArrayList: "+ arrlist); 

            arrlist.ensureCapacity(5000);
            
  
	}
}