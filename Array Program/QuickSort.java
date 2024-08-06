import java.util.*;
class QuickSort
{
    public static void main(String[]args)
    {
        int[]a={50,3,1,60,65,45,90,13,67};
        System.out.println("Before sorting:"+Arrays.toString(a));
        quickSort(a,0,a.length-1);
        System.out.println("After sorting:"+Arrays.toString(a));
    }
    public static void quickSort(int[]a,int low,int high)
    {
        if(low<high)
        {
            int pivote=a[high];
            int i=low-1,temp;
            for(int j=low;j<=high-1;j++)
            {
                if(a[j]<pivote)
                {
                    ++i;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            temp=a[i+1];
            a[i+1]=a[high];
            a[high]=temp;
            quickSort(a,low,i);  //left to write
            quickSort(a,i+2,high); //right to left
        }
    }
}