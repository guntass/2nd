import java.util.*;
public class Solution_print_1_to_n 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(5);
    }
	public static void print(int n)
    {
		if(n > 1)
        {
			print(n-1);
		}
		System.out.print(n+" ");
		
    }
}