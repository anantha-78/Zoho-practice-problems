package Zoho_Round2;

import java.util.Scanner;

public class SubarrayWindowLength {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		System.out.println(maximumSumSubarrayLength(a));
	}
	
	public static int maximumSumSubarrayLength(int[] a) {
		int maxsum = Integer.MIN_VALUE, currentsum = 0,start =0, end =0;
		int i=0, j=a.length-1;
		while(i<=j) {
			if(i==j) {
				i++;
				j = a.length-1;
			}
			for(int k = i; k<=j; k++) {
				currentsum += a[k];
			}
			if(maxsum < currentsum) {
				maxsum = currentsum;
				start = i;
				end = j;
			}
			currentsum = 0;
			j--;
		}
		return end+1-start;
	}

}
