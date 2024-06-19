class TechNumber
{
	public static void main(String[] args) {
		int num=2025;
		int dup=num;
		int length=0;

		while(num>0)
		{
			length++;  //4 -->even
			num/=10;
		}
		if(length%2==0)    //even
		{
			int div=1;
			for(int i=1;i<=length/2;i++)
			{
				div=div*10;                //1.-> 10 , 2.-> 100
			}
			int firstHalf=dup/div;    //20
			int lastHalf=dup%div;     //25
			int sum=firstHalf+lastHalf;

			int sqr=sum*sum;
			System.out.println((sqr==dup)?"Tech Number":"Not Tech Number");
		}
	}
}