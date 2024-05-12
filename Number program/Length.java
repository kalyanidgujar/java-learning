//Find length
class Length
{
	public static void main(String[] args) {
		int num=1233;
		int length=0;
		while(num>0)
		{
           length++;
		    num/=10;
		}
		System.out.println("Length is:"+length);
	}
}