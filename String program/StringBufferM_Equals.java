class  StringBufferM_Equals
{
	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer("Java");
		StringBuffer sb2= new StringBuffer("Java");

		String s1=new String("Java");
		String s2=new String("Java");

		System.out.println(sb1.equals(s1));   //false
		System.out.println(sb2.equals(s2));   //false

		System.out.println(sb1.equals(sb2));  //false
		System.out.println(s1.equals(s2));    //true
   
        System.out.println(s1.contentEquals(sb1)); //true

        System.out.println(sb1==sb2);    //false
        System.out.println(s1==s2);      //false


		


	}
}