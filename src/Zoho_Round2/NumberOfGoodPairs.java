package Zoho_Round2;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfGoodPairs {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		System.out.println(numberOfGoodPairs(a));
	}
	
	public static int numberOfGoodPairs(int[] a) {
		int goodPairs = 0;
		HashMap<Integer, Integer> countMap = new HashMap<>();
		
		for(int num : a) {
			if(countMap.containsKey(num)) {
				goodPairs += countMap.get(num);
			}
			countMap.put(num, countMap.getOrDefault(num, 0)+1);
		}
		return goodPairs;
	}

}
