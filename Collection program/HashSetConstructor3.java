import java.util.*;
class HashSetConstructor3
{
	public static void main(String[] args) {


		HashSet hs=new HashSet (3); 


        hs.add("Ajay");
        hs.add("Atul");
        hs.add("Shreya");
        hs.add("Mira");
        hs.add("Rekha");


  
		System.out.println(hs);          //[Shreya, Rekha, Atul, Ajay, Mira]    
		System.out.println(hs.size());     //5 

	}
}