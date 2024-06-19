//WAJP to fetch all the prime number in an array which is store in array
class ArrayPrimeNummber
{
	public static void main(String[] args) {
		int[]arr={2,3,4,7,13,14,15,16,17};
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}