package Zoho_Round2;

import java.util.Scanner;

public class FindExcel {
	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		System.out.println(findExcelMeth(n));
	}
	
	public static String findExcelMeth(int n) {
		String t = "";
		while(n>0) {
			int rem = n%26;
			if (rem == 0) {
                t = 'Z' + t;
                n = (n / 26) - 1;
            } else {
            	t = ((char)((rem-1)+ 'A'))+ t;
                n /= 26;
            }
		}
		return t;
	}

}
