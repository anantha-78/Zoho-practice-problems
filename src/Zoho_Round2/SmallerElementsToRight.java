package Zoho_Round2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallerElementsToRight {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		List<Integer> res = smallerElementsCount(a);
		System.out.println(res);
	}
	
	public static List<Integer> smallerElementsCount(int[] a){
		List<Integer> li = new ArrayList<>();
		int c=0, i=0, j=a.length-1;
		while(i<=j) {
			for(int k=i+1; k<=j; k++) {
				if(a[i] > a[k]) {
					c++;
				}
			}
			li.add(c);
			c=0;
			i++;
		}
		return li;
	}

}
