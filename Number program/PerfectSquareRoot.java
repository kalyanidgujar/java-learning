class PerfectSquareRoot
{
	public static void main(String[] args) {
		int num=9;
		boolean flag=false;
		int sqrrt=0;

		for(int i=1;i<=num/2;i++)
		{
			if(i*i==num)
			{
				flag=true;

				sqrrt=i;            //3
				break;
			}
		}
		if(flag)
		{
			System.out.println(sqrrt);
		}
		else 
		{
			System.out.println("Not perfect square");
		}
	}
}