package phase1;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter youe age :");
		age=s.nextInt();
		if(age>=60) {
			System.out.println("Senior citizen");
		}
		else {
			System.out.println("Not a senior citizen");
		}


	}

}
