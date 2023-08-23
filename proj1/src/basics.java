import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class basics {
    //Arrays
    public static void main(String args[])
    {
        //1d
        Scanner sc=new Scanner(System.in);
        int[] arr;//decleration
        arr=new int[5];//initailization
        int[] a=new int[5];//both
        int[] ab={1,2,3,4};
        for(int i=0;i<ab.length;i++)
        {
        System.out.print(ab[i]+" ");
        }
        System.out.println("\n");
        for(int num:ab)
        {
            System.out.print(num+" ");
        }
        int[] c={1,2,3};
        System.out.println(Arrays.toString(c));//arrays to string method
        //2d
        
      int[][] s=new int[3][2];
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<s[i].length;j++)
            {
                s[i][j]=sc.nextInt();
            }
        }
        for(int[] aa:s)
        {
            System.out.println(Arrays.toString(a));
        }
        for(int r=0;r<s.length;r++)
        {
            System.out.println(Arrays.toString(s[r]));
        }
        
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<s[i].length;j++)
            {
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }
         int[][] si={//Dynamic array
            {1,2,3},
            {1,2,3,3,4,4,4,5},
            {1,2}};
        for(int i=0;i<si.length;i++)
        {
            for(int j=0;j<si[i].length;j++)
            {
                System.out.print(si[i][j]+" ");
            }
            System.out.println();
        }
       ArrayList<Integer> l=new ArrayList<>(10);
        for(int i=0;i<5;i++)
        {
            l.add(sc.nextInt());
        }
        for(int i=0;i<5;i++)
        {
        System.out.print(l.get(i)+" ");//for printing iteratively
        }
        System.out.println(l.contains(90));//checks in the list if the element is present or not
        l.set(1,990);//replaces index 1 with elemnt 990
        System.out.println(l);
        l.remove(1);//removes the elemnt at index 1
        System.out.println(l);
        ArrayList<ArrayList<Integer>> li=new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            li.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                li.get(i).add(sc.nextInt());
            }
        }
        System.out.println(li);
        
    }
}
