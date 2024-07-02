import java.util.Scanner;
import java.util.Arrays;
class StringMethod_Equal
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

		if(userEquals(str1,str2))
		{
			System.out.println("str 1 and str2 are equal");
		}
		else {
			System.out.println("str1 and srt2 are not equal");
		 }

	}

		public static boolean userEquals(String str1,String str2)
		{
			// If both are null, they are considered equal
        if (str1 == null && str2 == null) 
        {
            return true;
        }

        // If one is null and the other is not, they are not equal
        if (str1 == null || str2 == null) 
        {
            return false;
        }
         // Compare lengths first for efficiency
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare characters
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;

		}
	}
		

