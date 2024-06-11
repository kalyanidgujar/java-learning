import java.util.Arrays;
class ArraySmallestNumber
{
	public static void main(String[] args) {
		int[]a={3,7,4,12,9,11,2};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
          if(a[i]<min)
          {
          	min=a[i];
          }

		}
		System.out.println(min);  //2
 	}
}