import java.util.Arrays;
import java.util.Scanner;

class ArrayProgramDriver
{
	int arr[];
	static Scanner sc=new Scanner(System.in);

	public void storeElements(int arr[])
	{
		this.arr=arr;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}

	public void displayElement()
	{
		System.out.println(Arrays.toString(arr));
	}


	public void findEvenNumber(int[]arr)
	{
       System.out.print("Even Elements: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();


	}






	public static void main(String[] args) {
		ArrayProgramDriver ap=new ArrayProgramDriver();
		boolean exit=true;
		while(exit)
		{
			System.out.println("***Welcome to Arrays Program***");
			System.out.println("1.Store Element:");
			System.out.println("2.Display Element");
			System.out.println("3.Find Even Number");
			System.out.println("4.Find Odd Number");
			System.out.println("5.Fetch Negative");
			System.out.println("6.Find Element");
			System.out.println("7.Exit");
			System.out.print("Enter a option:");
			int opt=sc.nextInt();

			switch(opt)
			{
              case 1:
              	{
                    System.out.print("Enter the size:");
		            int size=sc.nextInt();
		            System.out.print("Enter the Element:");
		            int arr[]=new int[size];
		            ap.storeElements(arr);
              	}
              	break;
              case 2:
              	{
                  if(ap.arr==null)
          			{
          				System.out.println("Add Array element to display it");
          			}
          			else 
          			{
          				ap.displayElement();
          			}
              	}
              	break;
              case 3:
              	{
              		if(ap.arr==null)
          			{
          				System.out.println("Please Add the elements first to find even number");
          			}
          			else 
          			{
          			   ap.findEvenNumber();

          			}

              	}
              	break;
			}
		}
	}


}