//5.WAJP to store the fibonacci series of any terms in an array
import java.util.Scanner;
import java.util.Arrays;
class ArrayFibonacciSeries
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of term in the fibonacci Series:");
		int num=sc.nextInt();

		//Array to store fibonacci series
		int[]fibonacci=new int[num];

		fibonacci[0]=0;
		fibonacci[1]=1;

		for(int i=2;i<num;i++)
		{
			fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
		}
		//printing fibonacci series
		System.out.println("Fibonacci Series:");
		for(int i=0;i<num;i++)
		{
			System.out.print(fibonacci[i]+" ");
		}
		
	}
}