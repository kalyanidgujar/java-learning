import java.util.*;
class RepeateEleArray
{
	public static void main(String[] args) {
		int a[]={1,3,1,4,2,1,5,2,7};
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++)
		{
			int cnt=1;
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j] && a[i]!=0)
				{
					a[j]=0;
					cnt++;
				}
			}
			if(cnt>1)
				System.out.println(a[i]+"  ");
			
			
		}

	}
}