import java.util.Scanner;
import java.util.Arrays;
class StringMethod_Split
{
	static String str1;
	static String str2;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a  first String:");
		str1=sc.nextLine();
		System.out.print("Enter a element split :");
		str2=sc.nextLine();


        String[]op=str1.split("#");
	    System.out.println("Result:"+op);




	    // String str = "Hello World";
        // String[] parts = str.split(" "); // Splitting based on space

        // for (String part : parts) {
        //     System.out.println(part);
        // }

	}
}