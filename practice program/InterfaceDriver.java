interface Parent1
{
	void m1();
}
interface Parent2
{
	void m2();
}
interface Child extends Parent1,Parent2
{
	void m3();
}
class Implementation implements Child
{
   public void m1()
   {
   	System.out.println("hello from Implementation m1()");
   }
   public void m2()
   {
   	System.out.println("hello Implementation m2()");
   }
   public void m3()
   {
   	System.out.println("hello Implementation m3()");
   }
}


class InterfaceDriver
{
	public static void main(String[] args) {
		Implementation obj=new Implementation();
		obj.m1();
		obj.m2();
		obj.m3();
		
	}
}