import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;        //reverse
			num/=10;

		}
		System.out.println("Reverse number is :"+rev);
	}
}