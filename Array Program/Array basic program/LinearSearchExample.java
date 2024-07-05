package comArrays;

public class LinearSearchExample {

	public static void main(String[] args) {
    int[]a= {5,4,6,3,7,2,8};
    int target=7;
    
    int index=getIndex(a,target);
    if(index==-1)
    {
    	System.out.println("Element not found");
    }else {
    	System.out.println("Element found at "+index);
    }
    
    
	}
	private static int getIndex(int[]a,int target)
	{ 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				return i;
			}
		}
		return -1;
		
	}

}
