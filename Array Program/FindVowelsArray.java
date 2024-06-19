// WAJP to find the count vowels and consonents in an array
//Vowels: a e i o u
//steps: 1. create an array of char datatype(dyanamically)
//       2.compare each position in an arr with vowels--->a e i o u
//       3. if it is vowel,increment the value of count vice-versa

import java.util.Scanner;
import java.util.Arrays;
class FindVowelsArray 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an array size:");
		int size=sc.nextInt();
		System.out.println("Enter array element:");  

		char []arr=new char[size];                     //craete arr of char datatype

		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next().charAt(0);                //also use toLower()
		}

		int vCount=0;
		int cCount=0;

		for(int i=0;i<size;i++)
		{
           if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
           {
           	    vCount++;
           }
           else  
           {
           	 cCount++;
           }
		}
		System.out.println("Vowel Count:"+vCount);
		System.out.println("Consonant Count:"+cCount);
		
	}
} 