package phase1;

import java.util.Scanner;

public class Greaterthan10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A value :");
		a=s.nextInt();
		if(a>10) {
			System.out.println("A is greater than 10");
		}
		else {
			System.out.println("A is lesser than 10");
		}

	}

}
