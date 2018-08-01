import java.util.*;
public class GFG_countingPalindromeWordsInASentence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        String p="";
        int c=0;
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++)
        {
            String k="",z="";
            k=words[i];
            for(int r=words[i].length()-1;r>=0;r--)
            {
                z=z+words[i].charAt(r);
            }
            if(z.equals(k))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}