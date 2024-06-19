//4.WAJP to store first 10th prime numbers in a new array
import java.util.Scanner;
import java.util.Arrays;
class ArrayFirstTenPrime
{
	public static void main(String[] args) {
		int[]a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		System.out.println("Array:"+Arrays.toString(a));
		int prime[]=new int[10];
		int count=0;              //counter for prime element found


		for(int i=0;i<a.length;i++)
		{
			boolean flag=true;
			if(a[i]==1)
				flag=false;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
			    prime[count] = a[i];
                count++;

                                           // If we have found 10 primes, exit the loop
                if (count == 10) {
                    break;

			}


			
		}



		}
		  System.out.print("First 10 prime numbers: " + Arrays.toString(prime));

	}
}
//Array:[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
//First 10 prime numbers: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]