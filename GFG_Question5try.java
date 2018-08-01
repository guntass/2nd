import java.util.*;
public class GFG_Question5try
{
    public static void main(String[]  args)
    {
        Deque<String> stack=new ArrayDeque<String>();
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();String p="";String z="";
        w=w+" ";
        for(int i=0;i<w.length()-1;i++)
        {
            if(w.charAt(i)==' ')
            {
                stack.push(p);
                p="";
            }
            p=p+w.charAt(i);
        }
        while(!stack.isEmpty())
        {
            z=stack.pop();
            System.out.print(z+" ");
        }
    }
}



