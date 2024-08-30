package Zoho_Round2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsCheck {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		scan.close();
		
		if(isAnagram(str1, str2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an Anagram");
		}
	}
	
	public static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}

}
