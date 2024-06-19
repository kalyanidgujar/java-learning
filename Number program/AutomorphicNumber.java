class AutomorphicNumber
{
	public static void main(String[] args) {
		int num=76;
		int dup=num;
		int sqr=num*num;    //5676
		int div=1;

		while(num!=0)
		{
			div*=10;

			num/=10;
		}

		int ld=sqr%div;      //5667%100= 76
		System.out.println((dup==ld)?"Automorphic Number":"Not Automorphic Number");

		
	}
}