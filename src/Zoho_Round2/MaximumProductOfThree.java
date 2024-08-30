package Zoho_Round2;

import java.util.Scanner;

public class MaximumProductOfThree {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		System.out.print(maximumProduct(a));
	}
	
	public static long maximumProduct(int[] a) {
		int maxp = 0, currentp = 1;
		for(int i=0; i<=a.length-3; i++) {
			currentp = a[i] * a[i+1] * a[i+2];
			if(maxp < currentp) {
				maxp = currentp;
			}
		}
		return maxp;
	}

}
