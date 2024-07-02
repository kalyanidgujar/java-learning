class StringExample2
{
	
	public static void main(String[] args) {
		 String kartikGf="";
	   	String kartikWife="Komal";
		

		if(kartikGf.isEmpty())
		{
			try
			{
			throw new Exception("kartik does not have GF");
		    }
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    	if(kartikWife.isEmpty())
		         {
            
			       System.out.println("Kartik does not have wife");
             
		           }
		            else 
		           {
		         	System.out.println("Kartik wife is:"+kartikWife);
		       }
		    }
		}
		
	}
}