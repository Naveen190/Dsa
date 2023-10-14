package Fibonacci;

import java.util.Scanner;

public class RotateNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		
		int d = 0 ; 
		
		
		int temp = n;
		
		while(temp != 0) {
			d++;
			temp = temp / 10;
		}
		
		k = k % d;
		if(k < 0) {
			k = k + d;	
		}
		
		int pow = (int)Math.pow(10, k);
		
		int a = n / pow;
		int b = n % pow;
		
		int shift = (int)(Math.pow(10, d-k));
		int ans = b * shift + a;
		
		System.out.println(ans);


	}

}
