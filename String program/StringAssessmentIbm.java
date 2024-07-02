import java.util.Scanner;
import java.util.*;

class StringAssessmentIbm
{
	public static void main(String[] args) {
		// String sentence="It is a pleasant day today";               //pleasant

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
		String str=sc.nextLine();

		String[]words=str.split(" ");
		String op="";
		System.out.println(Arrays.toString(words));

		int max=0;
		for(String i:words)
		{
			int len=i.length();
			if(max<len&& len%2==0)
			{
				max=len;
				op=i;
			}
		}
          System.out.println(str+":"+op);
	}
}