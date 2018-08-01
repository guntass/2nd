import java.util.*;
public class GFG_perfectSquareString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();int z=0;
        for(int i=0;i<s.length();i++)
        {
            z=z+(int)s.charAt(i);
        }
        double q=Math.sqrt(z);
        if(q==(int)q)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
              