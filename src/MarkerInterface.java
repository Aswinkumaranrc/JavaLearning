
 interface Allow{}
 
class student implements Allow{
	
}
class empolyee{
	
}
 
public class MarkerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s=new student();
		empolyee e=new empolyee();
		if(s instanceof Allow) {
			System.out.println("Allow him");
		}
		else {
			System.out.println("Don't allow him");
		}
	}

}
