package phase1;

import java.util.Scanner;

public class TofindPrimeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no, i;
		boolean prime=true;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any no :");
		no=s.nextInt();
		
		for (i=2;i<=no-1;i++) {
			if (no%i == 0)
			{
				prime = false;
				break;
			}
		}
		if(prime==true)
			System.out.println("Its a prime number");
		else
			System.out.println("Its not a prime number");

	}

}
