import java.util.*;
public class GFG_productClosestTo_x
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
        for(int i=0;i<=n-1;i++)
        {
            for(int j=1+1;j<=n-2;j++){
                if(Math.abs((a[i]*a[j])-x)<m)
                {
                    m=Math.abs((a[i]*a[j])-x);
                    m1=a[i];
                    m2=a[j];
                }
            }
        }
        System.out.println(m1+" "+m2);
    }
}
            
    