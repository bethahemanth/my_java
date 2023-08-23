package Arrays;
import java.util.*;

public class peak_element {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
			{
				System.out.println(arr[i]);
			}
		}
		
	}
}
