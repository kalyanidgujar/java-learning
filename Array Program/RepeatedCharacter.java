import java.util.*;
class RepeatedCharacter
{
	public static void main(String[] args) {
		//find distinct character from a string
		String str="abacabcdefa";
		System.out.println(str);
		int[]arr=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
		}
		Arrays.stream(arr).distinct().forEach(ele->System.out.print((char)ele));
	}
}