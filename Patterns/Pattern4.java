package Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// First Way
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int spc = 0;
		int star = n;
		
//		for(int r = 1;  r<=n;  r++) {
//			// Print spaces
//			for(int i = 1;  i<=spc;  i++) {
//				System.out.print("\t");
//			}
//			// Print stars
//			for(int i = 1;  i<=star;  i++) {
//				System.out.print("*\t");
//			}
//			System.out.println();
//			spc++;
//			star--;
//		}
		// \Second Way
		for(int r = 1;  r<=n ;  r++) {
			for(int c = 1;  c<=n;  c++) {
				if(r>c) {
					System.out.print("\t");
				}else {
					System.out.print("*\t");
				}
				
			}
			System.out.println();
		}
	
	}

}
