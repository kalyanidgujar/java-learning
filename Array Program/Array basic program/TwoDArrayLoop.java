//WAJP 1D array to using for,while,do while,for each loop
import java.util.*;
class TwoDArrayLoop
{
	public static void main(String[] args) {
		int arr[][]={{10,20},{30,40},{50,60}};
        //using for loop
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
              System.out.print(arr[i][j]+" ");			 //10 20 30 40 50 60
			}
		}
		System.out.println();

		//using while lopp
		int i=0;
		while(i<arr.length)
		{
			int j=0;
			while(j<arr[i].length)
			{
				System.out.print(arr[i][j]+" ");
				j++;
			}
			i++;
		}
		System.out.println();

		//do while loop
		int k=0;
		do{
			int p=0;
			do{
			  System.out.print(arr[k][p]+" ");
			   p++;

			}while(p<arr[k].length);
			k++;
		}while(k<arr.length);

		System.out.println();

		//for each loop
		for(int[] x:arr)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}

		}

	}
}
