import java.util.*;
public class Solution_finding_firstIndex_of_a_number_in_an_array
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
            System.out.println(firstIndex(a,p));
        }
        private static int startIndex=-1;
	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
		if(input.length==0)
		{
		    return -1;
		}
		if(startIndex>=input.length-1){return -1;}else{startIndex++;}
		if(input[startIndex]!=x)
		{
		    return firstIndex(input,x);
		}
		else{return startIndex;}
}
}
		
		  