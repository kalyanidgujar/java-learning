//rotation of array clockwise
import java.util.Arrays;

public class IterateArray {

	public static void main(String[] args) {
       int a[]= {4,2,1,3,5};
       System.out.println(Arrays.toString(a));
       int rt=2;
       
       for(int i=1;i<=rt;i++)
       {
    	   int temp=a[0];
    	   for(int j=1;j<a.length;j++)
    	   {
    		   a[j-1]=a[j];
    	   }
    	   a[a.length-1]=temp;
       }
       
    	   System.out.println(Arrays.toString(a));  //  [1, 3, 5, 4, 2]
       
       
       
	}

}



//using method 

/*public class IterateArray {

    public static void main(String[] args) {
       int a[]= {4,2,1,3,5};
       System.out.println(Arrays.toString(a));
       clockwiseRotate(a);
           System.out.println(Arrays.toString(a));  //  [1, 3, 5, 4, 2]
       
       
       
    }
    public static void clockwiseRotate(int []a)
    {
        int rt=2;
       
       for(int i=1;i<=rt;i++)
       {
           int temp=a[0];
           for(int j=1;j<a.length;j++)
           {
               a[j-1]=a[j];
           }
           a[a.length-1]=temp;
       }
       
    }

}
*/