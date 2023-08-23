package Arrays;
import java.util.*;
public class reverse {
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
        System.out.println("enter the elments indices that you wanna reverse element:");
        int st=sc.nextInt();
        int end=sc.nextInt();
        reverse(a,st,end);
        System.out.println(Arrays.toString(a));     
    }
    static void reverse(int[] a,int st,int end)
    {
        while(st<end)
        {
            swap(a,st,end);
            st++;
            end--;
        }
    }
    static void swap(int[] a,int index1,int index2)
        {
            int temp;
            temp=a[index1];
            a[index1]=a[index2];
            a[index2]=temp;
        }
}
