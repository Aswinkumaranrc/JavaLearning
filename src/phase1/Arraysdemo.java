package phase1;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		int b[]=new int[5];
		
		 Arrays.fill(a,18);
		 a[2]=3;
		 b=Arrays.copyOfRange(a, 1, 4);

		for (int i=0;i<b.length;i++)
		{
			System.out.println(a[i]);


}
		
 }
	
  }
