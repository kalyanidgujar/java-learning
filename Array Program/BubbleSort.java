import java.util.Arrays;
class BubbleSort
{
	public static void main(String[] args) {
		int[]arr={7,8,3,1,2};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
				//System.out.print(arr[i]);   //print element

		}
		System.out.println(Arrays.toString(arr));    //[1, 2, 3, 3, 7, 8]
	}
}