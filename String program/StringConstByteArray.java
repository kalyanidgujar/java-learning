import java.util.*;
class StringConstByteArray
{
	public static void main(String[] args) {
		byte[]arr={65,66,67,68};
		System.out.println(Arrays.toString(arr));
		String str=new String(arr);
		System.out.println(str);

		
	}
}