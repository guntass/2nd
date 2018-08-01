import java.util.*;
public class test2Q3try
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[i])
                {
                    count=1;
                }
                else
                {
                  count=0;
                  break;
                }
            }
            if(count==1)
            {
                System.out.print(a[i]+" ");
            }
            count=0;
        }
        System.out.print(a[n-1]);
    }
}