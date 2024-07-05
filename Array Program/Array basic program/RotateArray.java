//rotate array clockwise

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
       int a[]= {4,2,1,3,5};
       System.out.println(Arrays.toString(a));
       int rt=2;
       
       for(int i=1;i<=rt;i++)
       {
    	   int temp=a[a.length-1];
    	   for(int j=a.length-2;j>=0;j--)
    	   {
    		   a[j+1]=a[j];
    	   }
    	   a[0]=temp;
        
       }
       
    	   System.out.println(Arrays.toString(a));  //  [3,5,4,2,1]
       
       
       
	}

}




//rotate array in anticlockwise using method
/*public class RotateArray {

    public static void main(String[] args) {
       int a[]= {4,2,1,3,5};
       System.out.println(Arrays.toString(a));
       
       antoClockWiseRotate(a);
       System.out.println(Arrays.toString(a));  //  [3,5,4,2,1]
       
       
       
    }
    public static void antoClockWiseRotate (int[]a)
    {
        int rt=2;
        for(int i=1;i<=rt;i++)
        {
          int temp=a[a.length-1];
          for(int j=a.length-2;j>=0;j--)
          {
                 a[j+1]=a[j];
          }
          a[0]=temp;


        }
    }

}
*/