package Zoho_Round2;

import java.util.Scanner;

public class SaddlePoint {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] a = new int[n][n];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		scan.close();
		saddlePoint(a);
	}
	
	public static void saddlePoint(int[][] a) {
		boolean found = false;
		int rows = a.length;
        int cols = a[0].length;

        for (int i = 0; i < rows; i++) {
            // Step 1: Find the minimum element in the current row
            int minRowValue = a[i][0];
            int minColIndex = 0;
            for (int j = 1; j < cols; j++) {
                if (a[i][j] < minRowValue) {
                    minRowValue = a[i][j];
                    minColIndex = j;
                }
            }

            // Step 2: Check if this minimum element is the maximum in its column
            boolean isSaddlePoint = true;
            for (int k = 0; k < rows; k++) {
                if (a[k][minColIndex] > minRowValue) {
                    isSaddlePoint = false;
                    break;
                }
            }
        }
		
		if(!found) {
			System.out.println("No saddle point found");
		}
	}

}
