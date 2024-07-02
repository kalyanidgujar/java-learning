class  StringBufferM_Delete
{
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		sb.append("Karthik"+"\n");
		sb.append("has"+"\n");
		sb.append(2+"Girl Friends"+"\n");
		sb.append("and it is true");

		sb.delete(0,7);
		sb.insert(0,"Kaushik");

		System.out.println(sb);

	}
}