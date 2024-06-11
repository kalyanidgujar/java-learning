import java.util.*;
class ArraySeperateWord
{
	public static void main(String[] args) {
		String sen="hi how are you";
		String[]words=sen.split(" ");                //use split built in function
		System.out.println(Arrays.toString(words));

	}
}