//WAJP 1D array to using for,while,do while,for each loop

class OneDArrayLoop
{
	public static void main(String[] args) {
		int[]arr={12,13,15,17,22};

		int l=arr.length;
		//using for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		//using while loop
		int j=0;
		while(j<l)
		{
			System.out.print(arr[j]+" ");
			j++;
		}
		System.out.println();
		int k=0;
		do{
			System.out.print(arr[k]+" ");
			k++;
		}while(k<l);
		System.out.println();

		//for each loop
		for(int i:arr)
		{
          System.out.print(i+" ");
		}

	}
}