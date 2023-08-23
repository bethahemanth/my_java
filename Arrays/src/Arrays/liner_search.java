package Arrays;
import java.util.*;
public class liner_search {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the target element:");
	int target=sc.nextInt();
	int flag=0;
	int res = 0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==target)
		{
			flag=1;
			res=i;
		}
	}
	if(flag==0)
	{
		System.out.println("element not found");
	}
	else 
	{
		System.out.println("The element found at index:"+res);
	}
}
}
