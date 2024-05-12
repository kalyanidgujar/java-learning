//find power of num
class Power
{
	public static void main(String[] args) {
	int num=153;
	int dup=num;
	int length=0;
	int power=1;
	                                                                    //1.find length
	while(num!=0)
	{
		length++;
		num/=10;
	}
	for(int i=1;i<=length;i++)
	{
		power*=dup;
	}
     System.out.println("power is:"+power);

}
}