package Runtimeoverride;

 class parent{
	 int a;
	 parent(){
		 
	 }
	 parent(int a){
		 this.a=a;
	 }
	 void printdetails() {

		 System.out.println("The value of a :"+ a);
	 }
 }
 
 class child extends parent{
	 int b;
	 child(){
		 
	 }
	 child(int b){
		 this.b=b;
	 }
	 void printdetails() {
		 System.out.println("The value of b :"+ b);
	 }
 }

public class Methodoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child c=new child(30);
		c.printdetails();
		parent g=new parent(45);
		g.printdetails();

		
		
		

	}

}
