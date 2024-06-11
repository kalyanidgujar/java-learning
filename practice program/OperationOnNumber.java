import java.util.Scanner;
class OperationOnNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		for(;;)
		{
		System.out.println("*******Welcome to Perform Operation On Number********");
		System.out.println("1.Find Even Odd number");
		System.out.println("2.Find largest Number");
		System.out.println("3.Exit");
		System.out.print("Enter a option:");
		int opt=sc.nextInt();
		switch(opt)
		{
		  case 1:{
		  	        evenOdd();
		         }
		         break;
		     case 2:{

                         largestNumber();
		            }
		            break;
		        case 3:{
		        	      System.out.println("Existing....");
                          System.exit(0); 
		                }

		   default :
		       {
		       	System.out.println("Invalid option");
		       	break;
		       }      
		         
		}
		}


		
	}

	public static void evenOdd()
	{
		System.out.print("Enter a number:");
        int num=sc.nextInt();
        if(num%2==0)
        {
        	System.out.println(num+" is Even");
        }
        else 
        {
        	System.out.println(num+" is odd");
        }


	}
	public static void largestNumber()
	{
		System.out.print("Enter 1st Number:");
		int n1=sc.nextInt();
		System.out.print("Enter 2nd number:");
		int n2=sc.nextInt();
		System.out.print("Enter 3rd number:");
		int n3=sc.nextInt();
		int large=(n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
		System.out.println(n1+"," +n2+", " +n3+ " largest among three number is:"+large);
	}

}