//WAJP to find second largest element in array
import java.util.Arrays;
class SecondLargest_Element
{
	public static void main(String[] args) {
		int a[]={17,22,18,45,12};

		int temp=0;

		for(int i=0;i<a.length;i++)        //ascending order
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		// System.out.println(Arrays.toString(a));  //[12, 17, 18, 22, 45]
		int secondLarge=0;
		for(int i=0;i<a.length-1;i++)
		{
			secondLarge=a[i];
		}
		System.out.println(secondLarge);//22

		
	}
}