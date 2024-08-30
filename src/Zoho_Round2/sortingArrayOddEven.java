package Zoho_Round2;

import java.util.ArrayList;
import java.util.Scanner;

public class sortingArrayOddEven {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		seperateOddAndEven(a);
	}
	
	public static void seperateOddAndEven(int[] a) {
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		
		for(int i : a) {
			if(i%2 == 0) {
				even.add(i);
			}
			else {
				odd.add(i);
			}
		}
		
		//sorting(odd, 0, odd.size());
		//sorting(even, even.size(), 0);
	}
	
	public static void sorting(int[] a, int x, int y) {
		
	}

}
