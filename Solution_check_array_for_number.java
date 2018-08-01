import java.util.*;
public class Solution_check_array_for_number
{
	public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("enter number to search for");
            int p=sc.nextInt();
            System.out.println(checkNumber(a,p));
        }
	public static boolean checkNumber(int input[], int x)
	{
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
	if(input.length==0)
	{
	    return false;
	   }
		else if (input[input.length-1]==x)
		{
		    return true;
		}
		
		int smallInput[] = new int[input.length - 1];
		for(int i = 0; i < input.length-1; i++){
			smallInput[i] = input[i];
		}
		return checkNumber(smallInput,x);
        }
}
		
		
		  
