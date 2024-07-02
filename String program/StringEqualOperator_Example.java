class StringEqualOperator_Example
{
	public static void main(String[] args) {
		String s1=new String("java");
		String s2=new String("java");


		StringBuffer sb1=new StringBuffer("python");
		StringBuffer sb2=new StringBuffer("python");


		int a=4;
		int b=4;

		System.out.println(s1==s2);
		System.out.println(sb1==sb2);
		System.out.println(a==b);
	}
}