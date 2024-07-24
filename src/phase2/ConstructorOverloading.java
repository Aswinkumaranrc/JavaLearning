package phase2;


class hello1{
	String name;
	int adminno;
	
	hello1(String studname,int admin){
		this.name=studname;
		this.adminno=admin;
	}
	void printdetails() {
		System.out.println("NAME : "+name+"---"+"ADMISSION NO: "+adminno);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hello1 s=new hello1("Aswin",3);
		s.printdetails();

	}

}
