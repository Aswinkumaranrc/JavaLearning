
interface defaultinterface{
	void task1();
	void task2();
	default void task3() {
		System.out.println("This is default");
	}
}
class impl implements defaultinterface{

	@Override
	public void task1() {
		// TODO Auto-generated method stub
		System.out.println("This is task1");
	}

	@Override
	public void task2() {
		// TODO Auto-generated method stub
		System.out.println("This is task2");
	}
	
}

public class DefaultInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		defaultinterface d=new impl();
		d.task1();
		d.task2();
		d.task3();

	}

}
