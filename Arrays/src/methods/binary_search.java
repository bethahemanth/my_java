package methods;
import java.util.*;

import Arrays.intersection;
public class binary_search {
	public static void main(String args[])
	{
	int[] arr=new int[100];
	int target=34;
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=i;
	}
	Arrays.sort(arr);
	int res=Arrays.binarySearch(arr,target);
	if(res!=target)
	{
		System.out.println("target not found "+target);
	}
	else 
	{
		System.out.println(res+" found");
	}
	}
}
