import java.util.*;
class StringConstChar    
{
	public static void main(String[] args) {
		char[]ch={'R','A','M','E','S','H'};
		System.out.println(Arrays.toString(ch));
		String str1=new String(ch,0,3);
		System.out.println(str1);
		String str=new String(ch);

		}
}