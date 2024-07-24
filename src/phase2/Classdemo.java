package phase2;


 class Student{
	 
	 String name;
	 int rollno;
	 String dept;
	 long mobile;
	 int marks;
	 
	 void reading() {
		 System.out.println("Im reading");
	 }
	 
	 void grade() {
		 if(marks>60)
			 System.out.println("I class");
		 else
			 System.out.println("II class");
	 }
	 
 }

public class Classdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		s1.name="Aswin";
		s1.rollno=68;
		s1.dept="Mca";
		s1.mobile=9445383947l;
		s1.marks=95;
		s1.grade();
		
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		System.out.println(s1.dept);
		System.out.println(s1.mobile);
		System.out.println(s1.marks);
		
		

	}

}
