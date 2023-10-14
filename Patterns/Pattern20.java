package Patterns;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int r = 1;  r<=n;  r++) {
			for(int c = 1; c<=n;  c++) {
				if(c == 1  || c == n) {
					System.out.print("*\t");
				}
				else if(r >= (n+1)/2  && (r == c || r + c == n+1)) {
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
