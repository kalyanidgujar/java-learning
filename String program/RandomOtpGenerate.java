//WAJP to generate 25 random otp and store then in stringbuffer object
/*



*/

class RandomOtpGenerate
{
	public int generateOtp()
	{
		int max=1000;
		int min=1;
		int otp=(int)(Math.random()*(max-min)+1)+max;
		return otp;

	}
	public static void main(String[] args) {
		StringBuffer sb=new  StringBuffer();
         RandomOtpGenerate obj=new RandomOtpGenerate();

         for(int i=0;i<=25;i++)
         {
         	sb.append(obj.generateOtp()+"\n");
         }
        System.out.print(sb);
		
	}
}