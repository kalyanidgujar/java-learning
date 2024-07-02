//String codePointAt method create by user
import java.util.*;
class StringMethod_UserCodePointAt
{
	static String str=new String("ABCDEFGHIJ");
	public static void main(String[] args) {
		int index=userCodePointAt(5);
		System.out.println(str+":"+index);
	}

	public static int userCodePointAt(int index)
	{
		if(index<0|| index>str.length()-1)
		{
			throw new StringIndexOutOfBoundsException("wrong index:");
		}
		return str.charAt(index);
	}

}