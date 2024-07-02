/*import java.util.*;
class StringMethod_UserToUpperCase
{   
	static String str;
	public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter a String:");
    	String str=sc.nextLine();
    	String op=userToUpperCase();
    	System.out.println(str+":"+op);
      		
	}
	public static String userToUpperCase()
	{
		String nstr="";
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				nstr=nstr+(char)(ch-32);  //typecast
			}
			else 
			{
				nstr=nstr+ch;
			}
		}
		
		return nstr;      
	}


    


}*/



import java.util.*;

class StringMethod_UserToUpperCase {
    // Static variable declared at class level
    static String str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        str = sc.nextLine(); // Assigning user input to the static variable str
        String op = userToUpperCase(); // Calling the method to convert string to uppercase
        System.out.println(str + ":" + op);
    }

    public static String userToUpperCase() {
        String nstr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                nstr = nstr + (char) (ch - 32);  // Convert lowercase to uppercase
            } else {
                nstr = nstr + ch;
            }
        }
        return nstr; // Return the modified string

    }
}