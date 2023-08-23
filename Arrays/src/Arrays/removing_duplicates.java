package Arrays;
import java.util.*;
public class removing_duplicates {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n.o of elements");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int[] a=new int[n];
		int j=0;
		int c=0;
		for(int i=1;i<arr.length-1;i++)
		{
				if(arr[i]!=arr[i+1])
				{
					a[j]=arr[i];
					j++;
					c++;
				}
		}
		a[j]=arr[arr.length-1];
		c++;
		for(int i=0;i<c;i++)
		{
			System.out.print(a[i]);
		}
	}
}
