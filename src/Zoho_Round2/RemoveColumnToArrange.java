package Zoho_Round2;

import java.util.Scanner;

public class RemoveColumnToArrange {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char[][] a = new char[n][n];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = (scan.next()).charAt(0);
			}
		}
		scan.close();
		System.out.print(countOfColumnsToBeRemoved(a));
	}
	
	public static int countOfColumnsToBeRemoved(char[][] a) {
		int count =0, c=1;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length-1; j++) {
				if(a[j][i] < a[j+1][i]) {
					c++;
				}
				else {
					break;
				}
			}
			if(c != a[i].length) {
				count++;
			}
			c=1;
		}
		return count;
	}

}
