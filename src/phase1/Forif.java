package phase1;

import java.util.Scanner;

public class Forif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		Scanner s=new Scanner(System.in);
//		for (;;) {
//			System.out.println("Enter any number");
//			num=s.nextInt();
//			
//			if(num>0)
//				sum=sum+num;
//			else {
//				System.out.println(sum);
//				break;
//			}
//		}
//	
		System.out.println("Enter any value :");
		
		while((num=s.nextInt())>0){
			sum=sum+num;
		}
		System.out.println("The ans is "+ sum);
	}

}
