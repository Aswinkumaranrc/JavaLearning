package phase1;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, rem, sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number :");
		num=s.nextInt();
		
		while(num>0) {
			rem=num % 10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("The answer is : "+sum);
         
	}

}
