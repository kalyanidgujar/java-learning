import java.util.Scanner;
import java.util.Arrays;
class Mart
{

    StringBuffer fruits=new StringBuffer();
    Scanner sc=new Scanner(System.in);
    public void addFruits()
    {
    	System.out.println("Add Fruits:");
    	for(int i=1;i<=10;i++)
    	{
           fruits.append(sc.next()+" ");

    	}
    	System.out.println("==================================================");
    }

    public void buyFruits()
    {
    	System.out.println("Enter the fruit to buy:");
    	String buyFruit=sc.next();
    	String converted=new String(fruits);
    	String arr[]=converted.split(buyFruit);

    	System.out.println("=========The cart==========");
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println(arr[i]+"  ");
    	}
    	System.out.println("==========Thank You=========");
    }

	public static void main(String[] args) {
		Mart m=new Mart();
		m.addFruits();
		m.buyFruits();
		
	}
}


//WAJP to store the factors of a number in string buffer object and then display it
//WAJP to store the first 20 fibonacci number in a string buffer object
//WAJP to store the first 15 prime number in String buffer object
