package FunctionandNumberSystem;

import java.util.Scanner;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sourceBase = scn.nextInt();
		int destinationBase = anyBaseToDecimal(n , sourceBase);
		int dn = decimalToAnyBase(destinationBase , sourceBase);
		System.out.println(dn);
	
	}
	public static int decimalToAnyBase(int n , int b) {
		int ans = 0;
		int pow = 1;
		while(n > 0) {
			int d = n % b;
			n = n /b;
			
			ans+=d*pow;
			pow = pow * b;
		}
		return ans;	
	}
	
	public static int anyBaseToDecimal(int n , int b)
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
