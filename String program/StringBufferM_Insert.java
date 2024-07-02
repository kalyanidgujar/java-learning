class StringBufferM_Insert
{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("dinga");
		sb.insert(0,"penga");
		System.out.println(sb);    //pengadinga

		sb.delete(0,5);
		System.out.println(sb);    //dinga
	}
}