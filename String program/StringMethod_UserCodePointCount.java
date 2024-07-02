//String codePointCount method create by user
import java.util.*;
class StringMethod_UserCodePointCount
{
	static String str=new String("ABCDEFGHIJ");
	public static void main(String[] args) {
		int index=userCodePointCount(-7,3);
		System.out.println(str+":"+index);
	}

	public static int userCodePointCount(int startIndex,int endIndex)
	{
		if(startIndex>endIndex)
		{
			throw new StringIndexOutOfBoundsException("wrong index:");
		}
		return endIndex-startIndex;
	}

}