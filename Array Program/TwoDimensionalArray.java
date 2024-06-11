import java.util.*;
class TwoDimensionalArray
{
	public static void main(String[] args) {
		int[][]a={{10,20,30},{40,50,60},{70,80,90,100}};    //2-d array decl & initia

		//using for loop
		// for(int i=0;i<a.length;i++)
		// {
		// 	for(int j=0;j<a[i].length;j++)
		// 	{
		// 		System.out.print(a[i][j]+" ");
		// 	}
		// }
		// System.out.println();

		//using while loop
		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length)
			{
			System.out.print(a[i][j]+" ");
			j++;
		   }
		   	i++;
		}
	
		
	}
}