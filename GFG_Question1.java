import java.util.*;
class GFG_Question1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number that should be greater than the sum of paired elements of the array");
        int x=sc.nextInt();
        int s=0;
        int e=a.length-1;
        int count=0;
        while(s<=e)
        {
         if(a[s]+a[e]<x)
         {
             count+=(e-s);
             s++;
         }
         else 
         {
             e--;
         }
        }
        System.out.println(count);
    }
}