import java.util.*;
public class Solution_Sum_of_Array {
    //static int s=0;
    static int result;
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println(sum(a));
        }
	public static int sum(int input[])
	{
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
	        if(input.length<=0)
		{
		    return 0;
		}
	        int smallInput[] = new int[input.length - 1];
		for(int i = 0; i < input.length-1; i++){
			smallInput[i] = input[i];
		}
		
		
		result =sum(smallInput)+input[input.length-1];
		return result;
                
            }
        }
        