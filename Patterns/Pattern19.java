package Patterns;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int r = 1;  r<=n;  r++) {
			for(int c = 1;  c<=n;  c++) {
				if(r == (n+1)/2 || c == (n+1)/2) {
					System.out.print("*\t");
				}
				else if(r == 1 && c < (n+1)/2) {
					System.out.print("*\t");
				}
				else if(r == n && c > (n+1)/2) {
					System.out.print("*\t");
				}
				else if (c == 1  && r > (n+1)/2) {
					System.out.print("*\t");

				}
				else if (c == n  && r < (n+1)/2) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}

	}

}
