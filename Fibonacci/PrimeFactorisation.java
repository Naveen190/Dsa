package Fibonacci;

import java.util.Scanner;

public class PrimeFactorisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int div = 2;
		
		while(div * div <= n){
			if(n % div == 0) {
				System.out.print(div+ " ");
				n = n / div;
			}else {
				div++;
			}
		}
		System.out.println(n);
	}

}
