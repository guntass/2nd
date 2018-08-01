import java.util.*;
public class test2Q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String input=s;
        int m=Integer.MAX_VALUE;
        int zz=0;
        String[] words = input.split(" ");
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()<m)
            {
                m=words[i].length();
                zz=i;
            }
        }
        System.out.println(words[zz]);
    }
}
        
            
    