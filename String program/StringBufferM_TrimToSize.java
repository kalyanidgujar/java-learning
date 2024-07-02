class  StringBufferM_TrimToSize
{
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer(15000);
		sb.append("My name is dinga");
		System.out.println(sb.length());  //16
		System.out.println(sb.capacity());  //15000
		sb.trimToSize();
		

		System.out.println(sb);  //My name is dinga

	}
}