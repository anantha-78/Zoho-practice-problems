package Zoho_Round2;

import java.util.Scanner;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		System.out.println(longestPalindromicSubstring(input));
	}
	
	public static boolean isPalindrome(String s) {
		int i=0, j=s.length()-1;
		while(i<j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public static String longestPalindromicSubstring(String s) {
		for(int size = s.length(); size>=1; size--) {
			for(int i=0; i<=s.length()-size; i++) {
				if(isPalindrome(s.substring(i,i+size))) {
					return s.substring(i, i+size);
				}
			}
		}
		return null;
	}

}
