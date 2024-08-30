package Zoho_Round2;

import java.util.Scanner;

public class FindFreqOfString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();
		findFreq(input);
	}
	
	public static void findFreq(String s) {
		int[] a = new int[26];
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			int index = ch - 'a';
			a[index]++;
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i]!=0) {
				System.out.println((char)(i + 'a') + " - " + a[i]);
			}
		}
	}

}
