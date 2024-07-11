//ArrayList(Collection c)
import java.util.*;

import java.util.ArrayList;

public class ArrayListConstructor3 {
    public static void main(String[] args) {
       LinkedList<Integer> l1=new LinkedList<>();
       l1.add(10);
       l1.add(20);
       ArrayList<Integer> list=new ArrayList<>(l1);
       System.out.println(list);
        
    }
}
