import java.util.*;
public class Solution_count_number_of_digits {
public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }
	public static int count(int n){
	    //n=n/10;
		if(n/10 == 0){
			return 1;
		}
		int smallAns = count(n / 10);
		return smallAns +1;
	}

}