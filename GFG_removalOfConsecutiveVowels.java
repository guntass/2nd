import java.util.*;
public class GFG_removalOfConsecutiveVowels
{
    public static boolean is_vow(char c)
    {
        return (c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u');
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        print(s);
    }
    public static void print(String z)
    {
        System.out.print(z.charAt(0));
        for(int i=1;i<=z.length()-1;i++)
        {
            if((!is_vow(z.charAt(i)))||(!is_vow(z.charAt(i-1))))
            {
                System.out.print(z.charAt(i));
            }
        }
    }
}