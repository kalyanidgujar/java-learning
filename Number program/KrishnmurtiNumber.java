// number whose if the factorial dum of digit is equal to that number 145=1!+4!+5!=1+24+120=145

import java.util.Scanner;
class KrishnmurtiNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int dup=num;
		int sum=0;
		while(num>0)          // seperate the number
		{
			int rem=num%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact*=i;
			}
			sum+=fact;

			num/=10;
           
		}
		if(sum==dup)
		{
			System.out.println("Krishnmurti Number");
		}
		else 
		{
			System.out.println("Not Krishnmurti Number");
		}

	}
}