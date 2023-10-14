package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
//		           *
//		        *  * 
//           *   *   *
//       *   *   *   *   
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		// First way 
//		int spc = n - 1;
//		int stc = 1;
//		
//		for(int r = 1;  r<=n;  r++) {
//			// Print spaces
//			for(int i = 1;  i<=spc;  i++) {
//				System.out.print("\t");
//			}
//			// Print STARS
//			 
//			for(int i = 1;  i<=r;  i++) {
//				System.out.print("*\t");
//			}
//			
//			// Now manage the stars and spaces values
//			System.out.println();
//			spc--;
//			stc++;
		
		
		
		
		
		// Second way
		// relation b/w r and c
		for(int r = 1;  r<=n;  r++) {
			for(int c =1 ;  c<=n;  c++) {
				if(r+c >= n+1) {
					System.out.print("*\t");
				}
				else if(r+c < n+1) {
					System.out.print("\t");
				}
			}
			System.out.println();
			
			
		}
	}

}
