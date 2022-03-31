package first;
import java.util.Scanner;
public class Factorial {
	static int fact(int n) {
		// base case where you have to stop
		if(n==0 || n==1) {
			return 1;
		}
		// recursion case
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value whose factoria you "
				+" you want to calculate : ");
		int n=sc.nextInt();
		int ans=fact(n);
		System.out.println("factorial of "+n+" is "+ans);
		
		
	}

}
