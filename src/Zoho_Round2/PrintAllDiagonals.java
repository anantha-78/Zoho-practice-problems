package Zoho_Round2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllDiagonals {
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
		printAllDiagonals(a);
	}
	
	public static void printAllDiagonals(int[][] a) {
		List<Integer> li = new ArrayList<Integer>();
		
		int rows = a.length;
        int cols = a[0].length;

        // Traverse diagonals from bottom-right to top-left
        for (int sum = rows + cols - 2; sum >= 0; sum--) {
            int rowIndex = Math.max(0, sum - cols + 1);
            int colIndex = Math.min(sum, cols - 1);

            while (rowIndex < rows && colIndex >= 0) {
                li.add(a[rowIndex][colIndex]);
                rowIndex++;
                colIndex--;
            }
        }
		
		System.out.println(li);
	}

}
