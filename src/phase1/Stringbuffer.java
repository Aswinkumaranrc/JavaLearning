package phase1;

import java.util.Scanner;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str=scanner.next();
		
		StringBuffer sb=new StringBuffer(str);
		String reverse=sb.reverse().toString();
		
		if(reverse.toLowerCase().equals(str.toLowerCase()))
			System.out.println("palindrome");
		else
			System.out.println("Not a palindrome");

	}

}
