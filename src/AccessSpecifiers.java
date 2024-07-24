
 class sample{
	 int a;
	 sample(int x){
		 this.a=x;
	 }
	 void printdetails() {
		 System.out.println("The value of a is :" +a);
	 }
 }
 
public class AccessSpecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sample s=new sample(25);
		s.a=25;
		s.printdetails();
	}

}
