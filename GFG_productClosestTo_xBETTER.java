import java.util.*;
public class GFG_productClosestTo_xBETTER
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter x");
        int x=sc.nextInt();
        int s=0,e=a.length-1,m=Integer.MAX_VALUE,m1=0,m2=0;
        while(e>s)
        {
            if(Math.abs((a[s]*a[e])-x)<m)
                {
                    m=Math.abs((a[s]*a[e])-x);
                    m1=a[s];
                    m2=a[e];
                }
                if(a[s]*a[e]>x)
                {
                    e--;
                }
                else
                {
                    s++;
                }
            }
            System.out.println(m1+" "+m2);
        }
    }