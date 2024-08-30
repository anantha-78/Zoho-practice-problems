package Zoho_Round2;

import java.util.Scanner;

public class DutchNationalFlag {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		
		int low =0, mid=0, high = n-1;
		while(mid <= high) {
			if(a[mid] == 0) {
				a[low] = a[mid] + a[low];
				a[mid] = a[low] - a[mid];
				a[low] = a[low] - a[mid];
				low++;
				mid++;
			}
			else if(a[mid] == 2) {
				a[high] = a[mid] + a[high];
				a[mid] = a[high] - a[mid];
				a[high] = a[high] - a[mid];
				high--;
			}
			else {
				mid++;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
