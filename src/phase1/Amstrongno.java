package phase1;

import java.util.Scanner;

public class Amstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,rem,sum=0,copy;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any no :");
		num=s.nextInt();
		copy=num;
		
		while(num>0){
		    rem=num%10;
		    sum=sum+rem*rem*rem;
		    num=num/10;

	}
		if(copy==sum) {
			System.out.println("Armstrong number");
		}
		else
			System.out.println("Not a armstrong number");

}

  }