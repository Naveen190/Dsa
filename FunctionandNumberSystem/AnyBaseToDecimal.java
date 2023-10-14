package FunctionandNumberSystem;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int dn = getValueInBase(n , b);
		System.out.println(dn);
	
	}
	
	public static int getValueInBase(int n , int b)
	{
		int ans = 0;
		int pow = 1;
		while(n > 0) {
			int d = n % 10;
			n = n / 10;
			ans += d*pow;
			pow = pow*b;
		}
		return ans;
	}
	}


