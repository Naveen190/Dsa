package Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Diamond Pattern
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int star = 1;
		int space = n/2;
		
		for(int r = 1;  r<=n;  r++) {
			//Print spaces
			for(int i =1;  i<=space;  i++) {
				System.out.print("\t");
			}
			
			// Print stars
			for(int i = 1;  i<=star;  i++) {
				System.out.print("*\t");
			}
			System.out.println();
			if(r <= n/2) {
				space--;
				star+=2;
				
			}
			else if(r > n/2) {
				space++;
				star-=2;
			}
		}
	}

}
