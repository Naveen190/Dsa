package Patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int a = 0;
		int b = 1;
		
		for(int r = 1;  r<=n;  r++) {
			for(int i = 1; i<=r; i++) {
				System.out.print(a+"\t");
				int c = a + b;
				a = b;
				b = c;
			}
			System.out.println();
			
		}

	}

}
