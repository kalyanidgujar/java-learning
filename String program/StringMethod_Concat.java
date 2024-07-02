import java.util.Scanner;
import java.util.Arrays;
class StringMethod_Concat
{
	static String str1;
	static String str2;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a  first String:");
		str1=sc.nextLine();
		System.out.print("Enter a second String:");
		str2=sc.nextLine();

	    String result=userConcat(str1,str2);
	    System.out.println("Concatenation:"+result);

	}
	public static String userConcat(String str1,String str2)
	{
		String op=str1+str2;
		return op;

	}
}