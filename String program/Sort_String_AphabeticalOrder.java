//WAJP to sort String element to print the string based on alphabetical order
import java.util.*;
class Sort_String_AphabeticalOrder
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");  //qspider
		String str=sc.next();

		int arr[]=new int[str.length()];
		int temp=0;
        
        //extract array element and convert to ascii value
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.codePointAt(i);                       //codepointAt give ascii value

		}	


           //ascci value sort 
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			}
			System.out.println(Arrays.toString(arr));

            //convert ascii value to char & store it into the new string
			String s="";

			for(int i=0;i<arr.length;i++)
			{
               s=s+(char)arr[i];
			}
			System.out.print(s);
		
		
	}
}