interface InterfaceExample1
{
	// static
	// {
    //   System.out.println("hii from interface static  ");
	// }
	static int a=10;

	public static void main(String[] args) {
		System.out.println("hello main() from interface");
		System.out.println(a);
	}
}
class Child implements InterfaceExample1
{
	public void main(String[] args) {
		Child obj=new Child();
        

	}
}