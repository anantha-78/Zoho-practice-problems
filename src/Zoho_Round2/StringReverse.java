package Zoho_Round2;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();
		System.out.print(reverse(input));
	}
	
	public static String reverse(String s) {
		int i=0, j=s.length()-1;
		char[] ch = s.toCharArray();
		while(i<j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return new String(ch);
	}

}
