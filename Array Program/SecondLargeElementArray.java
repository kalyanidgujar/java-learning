//write a java pro to fetch the second largest element in array
import java.util.Scanner;
import java.util.Arrays;
class SecondLargeElementArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:");
		int size=sc.nextInt();
		System.out.println("Enter array element:");
		int []arr=new int[size];

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		int temp=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Ascending Array:"+Arrays.toString(arr));
		int SecondLargeNum=0;
		for(int i=0;i<size-1;i++)
		{
			secondLargeNum=arr[i];
		}
		System.out.println("Second largest Number in array:"+secondLargeNum);
		
	}
}