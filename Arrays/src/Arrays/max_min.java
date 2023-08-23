package Arrays;
import java.util.*;
public class max_min {
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elments:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the elments:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the elments indices that you wanna max element:");
        int st=sc.nextInt();
        int end=sc.nextInt();
        int r=max(a,st,end);
        System.out.println(r+"is the maximum element in the array");
        int re=min(a,st,end);
        System.out.println(re+"is the minimum element in the array");
    }
    static int max(int[] a,int st,int end)
    {
        int max=a[0];
        for(int i=st;i<=end;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    static int min(int[] a,int st,int end)
    {
    	int min=a[0];
    	for(int i=st;i<end;i++)
    	{
    		if(a[i]<min)
    		{
    			min=a[i];
    		}
    	}
    	return min;
    }
}
