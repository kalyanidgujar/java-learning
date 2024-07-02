import java.util.*;
class StringMethod4
{
	public static void main(String[] args) {
		String str=new String("ABCDEFGH");

		for(int i=0;i<str.length();i++)
		{
		  System.out.println(str.charAt(i)+":"+str.codePointAt(i));


		}
	}
}

/*o/p:
A:65
B:66
C:67
D:68
E:69
F:70
G:71
H:72*/