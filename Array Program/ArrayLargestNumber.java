import java.util.Arrays;
class ArrayLargestNumber
{
	public static void main(String[] args) {
		int[]a={3,7,4,12,9,11,2};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
          if(a[i]>max)
          {
          	max=a[i];
          }

		}
		System.out.println(max);  //12
 	}
}