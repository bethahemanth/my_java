package Arrays;
import java.util.*;
public class intersection {
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
	Set<Integer> n1=new HashSet<>();
	for(int i:nums1)
	{
		n1.add(i);
	}
	Set<Integer> n2=new HashSet<>();
	for(int i:nums2)
	{
		n2.add(i);
	}
	ArrayList<Integer> l=new ArrayList<>();
	for(int i:n1)
	{
		if(n2.contains(i))
		{
			l.add(i);
		}
	}
	int[] arr=new int[l.size()];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=l.get(i);
	}
	for(int i:arr)
	{
		System.out.println(i);
	}
	}
}
