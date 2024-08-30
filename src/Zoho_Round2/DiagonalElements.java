package Zoho_Round2;

import java.util.Scanner;

public class DiagonalElements {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] a = new int[n][n];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		scan.close();
		diagonalElements(a);
	}
	
	public static void diagonalElements(int[][] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i][i] + " ");
		}
	}

}
