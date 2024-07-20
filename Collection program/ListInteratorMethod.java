import java.util.*;
class ListInteratorMethod
{
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();

		for (int i=10;i<=50 ;i+=10 ) 
		{
			list.add(i);	
		}

		System.out.println(list);                          //[10, 20, 30, 40, 50]

	   ListIterator  listIterator=list.listIterator();


	     while (listIterator.hasNext()) {
            System.out.print(listIterator.next()+" ");    //10 20 30 40 50
        }

        System.out.println(listIterator.hasPrevious());    //true

        System.out.println();

         while (listIterator.hasPrevious()) {
            System.out.print(" "+listIterator.previous());    // 50 40 30 20 10

        }
        System.out.println();



        System.out.println(listIterator.nextIndex());          //0
        System.out.println(listIterator.previousIndex());      //-1

        listIterator.remove();

        System.out.println(list);          //[20, 30, 40, 50]


        ArrayList<Integer>element=new ArrayList<>();


        // Set an element using set()
        listIterator.next(); // Move to 20
        listIterator.set(55); // Replace 20 with 55
        System.out.println("After setting: " + list); // [55, 30, 40, 50]
        

        listIterator.add(66); // Add 66 before the current position (after 55)
        System.out.println("After adding 66: " + list); // [55, 66, 30, 40, 50]

        listIterator.next(); // Move to 30
        listIterator.add(99); // Add 99 before the current position (after 30)
        System.out.println("After adding 99: " + list); // [55, 66, 30, 99, 40, 50]

       


 



	}
}