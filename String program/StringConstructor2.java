//StringBuffer 

class StringConstructor2     
{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		String str1=new String(new StringBuffer("world"));
		System.out.println(str1);
		String str=new String();
		System.out.println(sb);
		System.out.println(str);

		}
}