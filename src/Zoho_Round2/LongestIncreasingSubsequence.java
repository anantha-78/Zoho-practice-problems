package Zoho_Round2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		System.out.print(longestIncreasingSubsequence(a));
	}
	
	public static int longestIncreasingSubsequence(int[] a) {
		if(a == null || a.length == 0) {
			return 0;
		}
		List<Integer> tail = new ArrayList<Integer>();
		
		for(int num : a) {
			int i = 0, j = tail.size();
			while(i<j){
				int mid = i + (j-i)/2;
				if(tail.get(mid) < num) {
					i = mid + 1;
				}
				else {
					j= mid;
				}
			}
			
			if(i == tail.size()) {
				tail.add(num);
			}
			else {
				tail.set(i, num);
			}
		}
		
		return tail.size();
	}

}
