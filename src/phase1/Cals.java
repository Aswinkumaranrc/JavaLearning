package phase1;

import java.util.Scanner;

public class Cals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int a,b,ch;
		double c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number 1");
		a=s.nextInt();
		System.out.println("enter a number 2");
		b=s.nextInt();
		System.out.println("enter your choice \n1.Add\n2.sub\n3.multi\n4division");
		ch=s.nextInt();
		
		switch(ch) {
		case 1:
			c=a+b;
			break;
		case 2:
			c=a-b;
			break;
		case 3:
			c=a*b;
			break;
		case 4:
			c=a/b;
			break;
	    default:
	    	System.out.println("menu va pathu pandra");
			
		}
		System.out.println(c);
	}

}
