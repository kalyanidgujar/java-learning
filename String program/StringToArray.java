import java.util.Arrays;
import java.util.Scanner;
class StringToArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a name:");
		String name=sc.next();
		char[]arr=stringToCharArray(name);
		System.out.println(Arrays.toString(arr));
		
	}
	public static char[] stringToCharArray(String name)
	{
		char[]arr=new char[name.length()];  
		//R A M E S H
		for(int i=0;i<name.length();i++)
		{
			arr[i]=(name.charAt(i));
		}   
		return arr;                
	}
}