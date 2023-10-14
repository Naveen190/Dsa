package Patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int spc = n/2;
		int valc = 1;
		int rst = 1;
		
		
		for(int r = 1;  r<=n ;  r++) {
			for(int i = 1;  i<=spc;  i++) {
				System.out.print("\t");
			}
			int val = rst;
			for(int i = 1;  i<=valc;  i++) {
				System.out.print(val+" \t");
				if(i <= valc/2) {
					val++;
				}else {
					val--;
				}
			}
			System.out.println();
			if(r <= n/2) {
				spc--;
				valc+=2;
				rst++;
			}else {
				spc++;
				valc-=2;
				rst--;
			}
			
			
		}

	}

}
