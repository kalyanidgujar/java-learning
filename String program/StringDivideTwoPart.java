//WAJP  to divide a string into two parts and store those parts in a seperate string object and dynamically 
//chetan   --> che tan
/*import java.util.Scanner;
class StringDivideTwoPart
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String:");
	String s=new String(sc.next().toLowerCase());

	int divided=s.length()/2;
	String part1=new String();
	String part2=new String();

	if(s.length()%2==0)
	{
      for(int i=0;i<divided;i++)
      {
      	char ch=s.charAt(i);
      	part1=part1+ch;
      }
      for(int i=divided;i<s.length();i++)
      {
      	char ch=s.charAt(i);
      	part2=part2+ch;
      }

	}
	else 
	{
		System.out.println("Cannot be divided value");
	}
	System.out.print(part1);
	System.out.println(part2);
	}

}*/

import java.util.Scanner;
class StringDivideTwoPart
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String:");
	String s=new String(sc.next().toLowerCase());

	int divided=s.length()/2;
	String part1=new String();
	String part2=new String();
	String part3=new String();

	if(s.length()%2==0)
	{
      for(int i=0;i<divided;i++)
      {
      	char ch=s.charAt(i);
      	part1=part1+ch;
      }
      for(int i=divided;i<s.length();i++)
      {
      	char ch=s.charAt(i);
      	part2=part2+ch;
      }
      for(int i=s.length()-1;i>=divided;i--)
      {
      	char ch=s.charAt(i);
      	part3=part3+ch;
      }
            	part3=part1+part3;


	}
	else 
	{
		System.out.println("Cannot be divided value");
	}
	System.out.print(part1);
	System.out.println(part2);
	System.out.print(part3);
	}

}