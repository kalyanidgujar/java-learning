class ArmstrongNumber
{
	public static void main(String[] args) {
		int num=1634;
		int length=0;
		int dup=num;
		int dup1=num;
		int sum=0;
		while(num>0)
		{
			length++;                           //length
			num/=10;

		}
		while(dup>0)                            //rem for seperate digit
		{
		  int rem=dup%10;
		  int power=1;
		  for(int i=1;i<=length;i++)            //power of each digit
		  {
            power*=rem;
		  }
		  sum+=power;
          dup/=10;

		}
		System.out.println((sum==dup1)?"Armstrong Number":"Not Armstrong");
	}
}