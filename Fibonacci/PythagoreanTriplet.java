package Fibonacci;

import java.util.Scanner;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();	
		int c = scn.nextInt();
		
		boolean isPT = false;
		
		if(a*a  == b*b + c*c) {
			isPT = true;
		}else if(b*b == a*a + c*c) {
			isPT = true;
		}else if(c*c == a*a + c*c) {
			isPT = true;
		}
		System.out.println(isPT);

	}

}
