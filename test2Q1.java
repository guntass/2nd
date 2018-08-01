import java.util.*;
public class test2Q1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int z=n,p=n;
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
            for(int i=0;i<n;i++)
        {
            z=p;
            while(z>0){
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            z--;
            System.out.println();
        }
        p--;
        //System.out.println();
    }
}
}
        
        