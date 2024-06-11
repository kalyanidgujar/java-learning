interface InterfaceExample
{
	int add(int a,int b);
	int multi(int a,int b);
}
class Arithmatic implements InterfaceExample
{
	public int  add(int a,int b)
	{
		return a+b;

	}
	public int multi(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args) {
		Arithmatic obj=new Arithmatic();
		System.out.println(obj.add(10,20));
		System.out.println(obj.multi(10,20));

		
	}
}