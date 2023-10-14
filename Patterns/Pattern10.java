package Patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int lfsc = n/2;
		int mspc = -1;
		
		for(int r = 1;  r<=n;  r++) {
			for(int i = 1;  i<=lfsc;  i++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			for(int i = 1;  i<=mspc; i++) {
				System.out.print("\t");
			}
			if(r != 1   &&   r!=n) {
				System.out.print("*\t");
			}
			System.out.println();
			if(r <= n/2) {
				lfsc--;
				mspc+=2;
			}else {
				lfsc++;
				mspc-=2;
			}
		}
	
	}
}
