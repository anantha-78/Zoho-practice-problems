package Zoho_Round2;

import java.util.Scanner;

public class ClimbingStaircase {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		System.out.println(distinctWays(n));
	}
	
	public static int distinctWays(int n) {
		if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		
		int[] dw = new int[n];
		dw[0] = 1;
		dw[1] = 2;
		for(int i=2; i<n; i++) {
			dw[i] = dw[i-1] + dw[i-2];
		}
		return dw[n-1];
	}

}
