package Zoho_Round2;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();
		if(isPalindrome(input)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
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

}
