package Arrays;
import java.util.*;
public class swap {
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
        System.out.println("enter the elments indices that you wanna swap:");
        int in=sc.nextInt();
        int in1=sc.nextInt();
        swap(a,in,in1);
        System.out.println(Arrays.toString(a));
    }
        static void swap(int[] a,int index1,int index2)
        {
            int temp;
            temp=a[index1];
            a[index1]=a[index2];
            a[index2]=temp;
        }
}
