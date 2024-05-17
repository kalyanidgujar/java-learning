//method overloading means same method name and different formal arguments
class MethodOverLoading
{
	public static void main(String[] args) {
		m1(10);
	}
	 static void m1()
	{
		System.out.println("no argument");
	}
	static void m1(int a)
	{
		System.out.println("1 argument int");
	}
	static void m1(byte b)
	{
		System.out.println("1 argument byte");
	}
		
}