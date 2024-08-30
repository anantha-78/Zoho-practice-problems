package Zoho_Round2;

import java.util.Scanner;

public class PartitionEqualSubsetSum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		System.out.println(partitionEqualSubsetSum(a));
	}
	
	public static int sum(int x, int y, int[] a) {
		int sum =0;
		for(int i=x; i<y; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	
	public static int partitionEqualSubsetSum(int[] a) {
		int par = -1;
		for(int i=1; i<a.length-1; i++) {
			if(sum(0, i, a) == sum(i+1,a.length,a)) {
				par = a[i];
			}
		}
		return par;
	}

}
