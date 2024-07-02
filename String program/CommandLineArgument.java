import java.util.Arrays;
class CommandLineArgument
{
	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int add=num1+num2;
		System.out.println("Addition is:"+add);
	}
}


//1.javac CommandLineArgument.java
//2.java CommandLineArgument 10 20

//Addition is:30