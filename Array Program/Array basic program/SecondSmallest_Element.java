//WAJP to find second smallest element in array
import java.util.Arrays;
class SecondSmallest_Element
{
	public static void main(String[] args) {
		int a[]={17,22,18,45,12};

		int temp=0;

		for(int i=0;i<a.length;i++)        //decsending order
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		int secondSmall=0;
		for(int i=0;i<a.length-1;i++)
		{
			secondSmall=a[i];
		}
		System.out.println(secondSmall);

		
	}
}