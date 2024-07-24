
class outer{
	int a;
	void display() {
		System.out.println("This is outer function");
	}
	static class inner{
		int b;
		void show() {
			System.out.println("This is inner function");
		}
	}
}


public class Staticinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer o= new outer();
		o.a=5;
		o.display();
		
		outer.inner i=new outer.inner();
		i.b=20;
		i.show();

	}

}
