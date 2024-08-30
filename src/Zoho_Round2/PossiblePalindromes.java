package Zoho_Round2;

import java.util.Scanner;

public class PossiblePalindromes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ip = scan.next();
		scan.close();
		findPalindrome(ip);
	}
	static void findPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		while (start <= end) {
			if (start == end) {
				start++;
				end = s.length() - 1;
			}
			String sub = s.substring(start, end + 1);
			boolean val = palindome(sub);
			if (val == true) {
				if (sub.length() > 1)
					System.out.println(sub);
			}
			end--;
		}
	}
	static boolean palindome(String ip) {
		int start = 0;
		int end = ip.length() - 1;
		while (start <= end) {
			if (ip.charAt(start) != ip.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
