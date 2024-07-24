package phase2;

class parent{
	String parentname;
	
	void setparentname(String name) {
		this.parentname=name;
	}
	
	void getparentname() {
		System.out.println(parentname);
	}
}

class child extends parent{
	String childname;
	
	void setchildname(String name) {
		this.childname=name;
	}
	
	void getchildname() {
		System.out.println(childname);
	}
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child s=new child();
		s.setchildname("hello");
		s.setparentname("bcc");
		s.getparentname();
		s.getchildname();

		
	}

}
