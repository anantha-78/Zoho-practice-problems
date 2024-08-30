package Zoho_Round2;

import java.util.Scanner;

public class MaximumProductSubarray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		maximumProductSubarray(a);
	}
	
	public static void maximumProductSubarray(int[] a) {
		if (a.length == 0) 
			System.out.println(0);

        int maxProduct = a[0];
        int minProduct = a[0];
        int result = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(a[i], maxProduct * a[i]);
            minProduct = Math.min(a[i], minProduct * a[i]);

            result = Math.max(result, maxProduct);
        }

        System.out.println(result);
	}

}
