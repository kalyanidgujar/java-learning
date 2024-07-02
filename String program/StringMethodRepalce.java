//Remove the character in string   take user input
//eg.playhomessss   ----->s remove
/*class StringMethodRepalce
{
	public static void main(String[] args) {
		String s="playhomessss";
		String replace=s.replace('s','');
		System.out.println("Old String:"+s);
		System.out.println("New Character replace:"+replace);
	

		
	}
}*/
import java.util.Scanner;
class StringMethodRepalce
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a name:");
		String s=sc.next();

		System.out.println("Enter the character to remove the occurence:");
		String ch=sc.next();
		String replace=s.replace(ch,"");

		//System.out.println("Old String:"+s);
		System.out.println("New Character replace:"+replace);
	

		
	}
}