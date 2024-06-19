class ArrayPrime
{
	public static void main(String[] args) {
		int[]a={1,2,3,4,5,6,7,8,9,10};

		for(int i=0;i<a.length;i++)
		{
			boolean flag=true;
			if(a[i]==1)
				flag=false;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println("Prime number:"+a[i]);
			}
			else 
			{
				System.out.println("Not prime number:"+a[i]);
			}
		}
	}
}