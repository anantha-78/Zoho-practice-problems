package Zoho_Round2;

import java.util.Scanner;

public class TrailingZeros {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		scan.close();
		System.out.println(removeTrailingZeros(n));
	}
	
	public static String removeTrailingZeros(String s) {
		int i=s.length()-1;
		while(i>=0) {
			if(s.charAt(i) == '0') {
				i--;
			}
			else {
				break;
			}
		}
		return s.substring(0, i+1);
		
	}

}
