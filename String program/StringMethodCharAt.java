import java.util.*;
class StringMethodCharAt
{
	public static void main(String[] args) {
		String a=new String("RAMESH");
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(2));
		System.out.println(a.charAt(3));

	//System.out.println(a.charAt(-1));    //StringIndexOutOfBoundsException
		System.out.println(a.length()-1);    //5
	//	System.out.println(a.charAt(-1));  //StringIndexOutOfBoundsException
		System.out.println(a.length());



	}
}