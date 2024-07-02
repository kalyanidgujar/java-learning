import java.util.*;
class StringConst3
{
	public static void main(String[] args) {
		char[]ch={'R','A','M','E','S','H'};
		byte[]b={65,66,67,68,69,70};
		String str3=new String(b,1,4);
		System.out.println(str3);    //BCDE

		String str=new String(b);
		System.out.println(str);      //ABCDEF

		String str1=new String(ch,0,3);
		System.out.println(str1);      //RAM

		String str2=new String(ch);
		System.out.println(str2);      //RAMESH
	}
}