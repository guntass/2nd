import java.util.*;
public class GFG_Question2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your range");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
        for(int i=n1+1;i<n2;i++)
        {
            int r=0,c=0,p=i,f=i,q=i;
            while(f>0)
            {
               r=f%10;
               c++;
               f=f/10;
            }
            r=0;int z=0;
            while(p>0)
            {
                r=p%10;
                for(int j=1;j<=c-1;j++)
                {
                    p=p/10;
                }
                z=p%10;
                p=p/10;
            }
            if(r==z)
            {
                count++;
                //System.out.println(q);
            }
            r=0;z=0;c=0;
        }
        System.out.println(count);
    }
}       