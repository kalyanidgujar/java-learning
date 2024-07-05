//   *8*6*4*2*8*6*4*2
//   *6*4*2*6*4*2
//   *4*2*4*2
class PatterAssessment
{
	public static void main(String[] args) {
		

		for(int i=1;i<=2;i++)
		{
			for(int j=8;j>=2;j--)
			{
				if(j%2==0)

				System.out.print("*"+j);
			}
		}
		System.out.println();
		for(int i=1;i<=2;i++)
		{
			for(int j=6;j>=2;j--)
			{
				if(j%2==0)

				System.out.print("*"+j);
			}
		}
		System.out.println();
		for(int i=1;i<=2;i++)
		{
			for(int j=4;j>=2;j--)
			{
				if(j%2==0)

				System.out.print("*"+j);
			}
		}
		System.out.println();
		for(int i=1;i<=2;i++)
		{
			for(int j=2;j>=2;j--)
			{
				if(j%2==0)

				System.out.print("*"+j);
			}
		}

	}
}