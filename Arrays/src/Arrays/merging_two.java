package Arrays;
import java.util.*;
public class merging_two {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n.o of elements num1:");
		int num1=sc.nextInt();
		int[] nums1=new int[num1];
		System.out.println("Enter the  elements num1:");
		for(int i=0;i<num1;i++)
		{
			nums1[i]=sc.nextInt();
		}
		System.out.println("Enter the n.o of elements num2:");
		int num2=sc.nextInt();
		int[] nums2=new int[num2];
		System.out.println("Enter the elements num2:");
		for(int i=0;i<num2;i++)
		{
			nums2[i]=sc.nextInt();
		}
		System.out.println("d value:");
		int d=(nums1.length)+(nums2.length);
		System.out.println(d);
		 int[] arr=new int[d];
	     int c=0;
	        for(int i=0;i<nums1.length;i++)
	        {
	            arr[c]=nums1[i];
	            c++;
	        }
	        for(int j=0;j<nums2.length;j++)
	        {
	            arr[c]=nums2[j];
	            c++;
	        }
	        for(int i=0;i<d;i++)
	        {
	            System.out.print(arr[i]+" ");
	        }
	}

}
