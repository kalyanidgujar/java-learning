import java.util.Scanner;
class FactorNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();                 //10
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			  System.out.print(i+" ");
			
		}
	}
}