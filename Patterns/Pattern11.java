package Patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int num = 1;
		
		for(int r = 1;  r<=n;  r++) {
			for(int i = 1;  i<=r;  i++) {
				System.out.print(num +"\t");
				num++;
			}
			System.out.println();
		}

	}

}
