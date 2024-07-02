//WAJP 3D array to using for,while,do while,for each loop
class ThreeDArrayLoop
{
	public static void main(String[] args) {
		int arr[][][]={{{10},{20}},{{30},{40}}};

		//using for loop
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
			}
		}
		System.out.println();
		//using while loop

		int l=0;
		while(l<arr.length)
		{
			int m=0;
			while(m<arr[l].length)
			{
				int n=0;
				while(n<arr[l][m].length)
				{
					System.out.print(arr[l][m][n]+" ");
					n++;
				}
				m++;
			}
			l++;
		}
		System.out.println();

		// do while loop
		int p=0;
		do{
			int q=0;
			do{
				int r=0;
				do{
					System.out.print(arr[p][q][r]+" ");
					r++;
				}while(r<arr[p][q].length);
				q++;
			}while(q<arr[p].length);
			p++;
		}while(p<arr.length);
		System.out.println();

		// for each

		for(int[][] x:arr)
		{
			for(int[] y:x)
			{
				for(int z:y)
				{
					System.out.print(z+" ");
				}
			}
		}
	}
}

