class StringOverrideEqualsMethod
{
	String gf1;
	String gf2;
	String gf3;

	StringOverrideEqualsMethod(String gf1,String gf2,String gf3)
	{
		this.gf1=gf1;
		this.gf2=gf2;
		this.gf3=gf3;
	}

	//overriding equals()
	@Override
	public boolean equals(Object obj)
	{
		StringOverrideEqualsMethod s=(StringOverrideEqualsMethod)obj;     //downcasting
		return this.gf1==s.gf1 && this.gf2==s.gf2 && this.gf3==s.gf3;
	}

	StringOverrideEqualsMethod(String gf1)
	{
		this.gf1=gf1;
	}
	public static void main(String[] args) {
		StringOverrideEqualsMethod s1=new StringOverrideEqualsMethod("Kanchana","koamla","kangana");
		StringOverrideEqualsMethod s2=new StringOverrideEqualsMethod("Kanchana","koamla","kangana");

		StringOverrideEqualsMethod s3=new StringOverrideEqualsMethod("Kachadi");
		StringOverrideEqualsMethod s4=new StringOverrideEqualsMethod("Kachadi");

         System.out.println(s1.equals(s2));  //true
         System.out.println(s2.equals(s4));  //false

	}
}