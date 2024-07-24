package phase2;

  class hello{
	  int area;
	  
	  void cals(int x) {
		  area=x*x;
		  System.out.println("Area of square : " + area);
	  }
	  void cals(int x,int y) {
		  area=x*y;
		  System.out.println("Area of triangle : " + area);
	  }
	  void cals(int x,int y,int z) {
		  area=x*y*z;
		  System.out.println("Area of cuboid : " + area);
	  }
	  void cals(String x) {
		  System.out.println(x);
	  }
	  void cals(String x,String y) {
		  System.out.println(x+y);
	  }
  }

public class Polydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hello s=new hello();
		s.cals(5);
		s.cals(5,10);
		s.cals(3, 20, 5);
		s.cals("aswin");
		s.cals("Aswin", "Kumaran");

	}

}
