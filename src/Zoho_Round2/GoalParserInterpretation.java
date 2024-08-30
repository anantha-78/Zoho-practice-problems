package Zoho_Round2;

import java.util.Scanner;

public class GoalParserInterpretation {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input =scan.nextLine();
		scan.close();
		System.out.println(goalParser(input));
	}
	
	public static StringBuilder goalParser(String s) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while(i<s.length()) {
			if(s.charAt(i) == 'G') {
				sb.append(s.charAt(i));
			}
			else if(s.charAt(i) == '(') {
				if(s.charAt(i+1) == ')') {
					sb.append('o');
					i++;
				}
				else if(s.charAt(i+1) == 'a' && s.charAt(i+2) == 'l' && s.charAt(i+3) == ')'){
					sb.append("al");
				}
			}
			i++;
		}
		return sb;
	}

}
