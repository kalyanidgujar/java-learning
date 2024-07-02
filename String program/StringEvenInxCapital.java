// manipulate the given string based on the data set:-
//input: abcdefg
//output:AbCdEfG
import java.util.Scanner;
class StringEvenInxCapital
{
	public static void main(String[] args) {
		// String s="abcdefg";
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter srting:");
		String s=sc.next().toLowerCase();

       String newString="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
		
             newString=newString+s.substring(i,i+1).toUpperCase();
			}
			else 
			{

			 newString=newString+s.substring(i,i+1).toLowerCase();


			}

		}
		System.out.println(newString);
	}
}