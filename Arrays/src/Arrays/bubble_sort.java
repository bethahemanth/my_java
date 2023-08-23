package Arrays;
import java.util.*;
public class bubble_sort {

public static int[] bubblesort(int[] arr,int n)
{
	int temp;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
	}
	return arr;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the elements:");
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	bubblesort(arr,n);
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
}
}
