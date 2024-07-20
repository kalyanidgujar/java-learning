import java.util.*;
class HashSetConstructor4
{
	public static void main(String[] args) {


		HashSet<String> hs=new HashSet<>(3,0.75f); 


        hs.add("Ajay");
        hs.add("Atul");
        hs.add("Shreya");
        hs.add("Mira");


  
		System.out.println(hs);             
		System.out.println(hs.size());    
	}
}