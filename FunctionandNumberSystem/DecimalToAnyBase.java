package FunctionandNumberSystem;

import java.util.Scanner;

public class DecimalToAnyBase {

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
			int d = n % b;
			n = n / b;
			
			ans = ans + d*pow;
			pow = pow * 10;			
		}
		return ans;
	}

}
