package Fibonacci;
import java.util.Scanner;
public class GcdAndLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		int gcd = 0;
		
		int divident = n1;
		int divisor = n2;
		
		while(divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		gcd = divisor;
		
		int lcm = (n1 * n2) / gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		
		

	}

}
