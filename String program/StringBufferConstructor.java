//example for StringBuffer() const


/*class StringBufferConstructor
{
	public static void main(String[] args) {
       StringBuffer sb=new StringBuffer();
       sb.append("java");
       System.out.println(sb.length());  //length->4
       System.out.println(sb.capacity());//default initial capacity-->16
	}
}*/

/*class StringBufferConstructor
{
    public static void main(String[] args) {
       StringBuffer sb=new StringBuffer(1500);
       System.out.println(sb.length());  //length->0
       sb.append("java");

       System.out.println(sb.capacity());//default initial capacity-->1500
    }
}*/

class StringBufferConstructor
{
    public static void main(String[] args) {
       StringBuffer sb=new StringBuffer("Hello");
       System.out.println(sb.length());  //length->5

       System.out.println(sb.capacity());//initial capacity-->21
    }
}