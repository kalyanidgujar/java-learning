class FibonacciSeries
{
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2+" ");

		for(int i=1;i<=10;i++)
		{
			int op=num1+num2;


			System.out.print(op+" ");                //0 1 1 2 3 5 8 13 21 34 55 89
			num1=num2;
			num2=op;
		}
	}
}