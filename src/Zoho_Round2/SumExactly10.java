package Zoho_Round2;

import java.util.Scanner;

public class SumExactly10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		System.out.print(sumExactly10(n));
	}
	
	public static int sumExactly10(int n) {
		int x = n;
		int rem = 10;
		while(n>0) {
			rem = rem - (n%10);
			n = n/10;
		}
		return (x*10) + rem;
	}

}
