package Zoho_Round2;

import java.util.Scanner;

public class RearrangeZeroToLeft {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		
		int[] res = rearrangeLeft(a);
		for(int i : res) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] rearrangeLeft(int[] a) {
		int i=a.length-1, j = a.length-1;
		while(i>=0 && j>=0) {
			if(a[j] != 0) {
				j--;
			}
			else if(a[i] == 0) {
				i--;
			}
			else if(a[i] != 0) {
				a[j--] = a[i--];
			}
		}
		while(j>=0) {
			a[j--] = 0;
		}
		return a;
	}

}
