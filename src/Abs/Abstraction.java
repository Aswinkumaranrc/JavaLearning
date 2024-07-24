package Abs;

    abstract class abs{
	 
	  void task1() {
		 System.out.println("Completed");
	 }
	 
	abstract void task2();
 }
    
    class two extends abs{
    	void task2() {
    		System.out.println("Completed task 2");
    	}
    }

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		two t=new two();
		t.task1();
		t.task2();

	}

}
