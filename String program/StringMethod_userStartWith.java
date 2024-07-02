import java.util.Scanner;
class StringMethod_userStartWith
{
	static String  str;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
		str=sc.nextLine();
		System.out.print("Enter string to check:");
		String str1=sc.next();
		System.out.print("Enter index:");
		int searchIndex=sc.nextInt();
		boolean op=userStartWith(str1,searchIndex);
		System.out.println(str+":"+op);

	}
	public static boolean userStartWith(String str1)
	{
		boolean flag=true;
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch!=str1.charAt(i))
			{
				flag=false;
				break;
			}
		}
		return flag;
	}


	public static boolean userStartWith(String str1,int startIndex)
	{
		if(startIndex<0 || startIndex>str.length()-1)
		{
			throw new StringIndexOutOfBoundsException("Wrong index"+startIndex);
		}
		boolean flag=true;
		for(int i=startIndex;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch!=str.charAt(i))
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}

/*output:
Enter a String:hello world
Enter string to check:hello
Enter index:1
hello world:true*/