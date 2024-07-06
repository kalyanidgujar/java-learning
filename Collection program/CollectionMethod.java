import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class CollectionMethod{

      public static void main(String[] args) {
       ArrayList<Integer> arrayList=new ArrayList<Integer>();
       arrayList.add(40);
       arrayList.add(50);
       arrayList.add(60);
       
       Collection<Integer> collection=new ArrayList<Integer>();
       System.out.println(collection);
       collection.add(10);
       collection.add(20);
       collection.add(30);
       System.out.println(collection);
       
       collection.addAll(arrayList);
       
       System.out.println(collection);
    }






	

}


// public static void main(String[] args) {
    //    ArrayList arrayList=new ArrayList();
    //    arrayList.add(40);
    //    arrayList.add(50);
    //    arrayList.add(60);
       
    //    Collection collection=new ArrayList();
    //    System.out.println(collection);
    //    collection.add(10);
    //    collection.add(20);
    //    collection.add(30);
    //    System.out.println();
       
    //    collection.addAll(arrayList);
       
    //    System.out.println(collection);
    // }