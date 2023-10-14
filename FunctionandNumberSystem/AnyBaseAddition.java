package FunctionandNumberSystem;

import java.util.Scanner;

public class AnyBaseAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int d = getSum(b , n1 , n2);
		System.out.println(d);

	}

	private static int getSum(int b, int n1, int n2) {	
		int ans = 0;
		int pow = 1;
		int carry = 0;
		while(n1 > 0 || n2 > 0 || carry != 0) {
			int d1 = n1 % 10;
			int d2 = n2 % 10;
			
			n1 = n1 /10;
			n2 = n2 /10;
			
			int sum = d1 + d2 + carry;
			int d = sum % 10;
			carry = sum / 10;
			
			ans = ans + d*pow;
			pow = pow*10;
		}
		return ans;
	}

}
