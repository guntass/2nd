import java.util.*;
public class GFG_smallestAlphabetGreaterThanGivenCharacter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        char[] a=new char[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            String s=sc.nextLine().toLowerCase();
            char c=s.charAt(0);
            a[i]=c;
        }
        char x=sc.nextLine().toLowerCase().charAt(0);
        int xint=(int)x;
        for(int h=0;h<n;h++)
        {
            if((int)a[h]>xint)
            {
                System.out.println(a[h]);
                break;
            }
        }
    }
}