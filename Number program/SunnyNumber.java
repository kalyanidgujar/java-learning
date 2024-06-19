class SunnyNumber
{
	public static void main(String[] args) {
		int num=8;
		int num1=num+1;   //9
		boolean flag=false;
		int sqrt=0;

		for(int i=1;i<=num/2;i++)
		{
			if(i*i==num1)
			{
				flag=true;

			    sqrt=i;
			   break;

			}
		}
		if(flag)
		{
			System.out.println("Sunny Number");
		}
		else 
		{
			System.out.println("Not Sunny Number");
		}
	}
}