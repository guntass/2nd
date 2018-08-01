import java.util.*;
public class GFG_fibonacciWord
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        String w=fibWord(n);
        System.out.println(w);
    }
    public static String fibWord(int n)
    {
        String s0="0";
        String s1="01";
        String s="";
        if(n==0)
        {
            System.out.print(s0);
        }
        else if(n==1)
        {
            System.out.print(s1);
        }
        if(n>1)
        {
            s=fibWord(n-1)+fibWord(n-2);
        }
        return s;
    }
}
        