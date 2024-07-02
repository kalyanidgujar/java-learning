//String codePointBefore method create by user
import java.util.*;
class StringMethod_UserCodePointBefore
{
	static String str=new String("ABCDEFGHIJ");
	public static void main(String[] args) {
		int index=userCodePointBefore(5);
		System.out.println(str+":"+index);
	}

	public static int userCodePointBefore(int index)
	{
		if(index<0|| index>str.length()-1)
		{
			throw new StringIndexOutOfBoundsException("wrong index:");
		}
		return str.charAt(index-1);
	}

}