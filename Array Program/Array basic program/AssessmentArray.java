import java.util.*;
class AssessmentArray
{
	public static void main(String[] args) {
		int a[]={16,17,4,3,5,2};
		System.out.println(Arrays.toString(a));
         int max=Integer.MIN_VALUE;
         int index=0;
         for(int i=0;i<a.length;i++)
         {
         	if(max<a[i])
         	{
         		index=i;
         		max=a[i];
         		
         	}
         }
		
       System.out.println(max);


	}
}















// for(int i=0;i<a.length;i++)
		// {
		// 	for(int j=i;j<a.length;j++)
		// 	{
				
		// 		if(a[j]>a[i])
		// 		{
		// 			max=a[j];

		// 		}
		// 	}
		// 					                    System.out.println(max);

		// }