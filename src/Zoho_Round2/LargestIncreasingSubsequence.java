package Zoho_Round2;

import java.util.Scanner;

public class LargestIncreasingSubsequence {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		largestIncreasingSequence(a);
	}

	public static void largestIncreasingSequence(int[] a) {
		int currentlen = 1, maxlen = 1, end =0;
		for(int i=1; i<a.length; i++) {
			if(a[i] > a[i-1]) {
				currentlen++;
			}
			else {
				if(currentlen > maxlen) {
					maxlen = currentlen;
					end = i;
				}
				currentlen = 1;
			}
		}
		if (currentlen > maxlen) {
            maxlen = currentlen;
            end = a.length;
        }
		
		for(int i=end-maxlen; i<end; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
