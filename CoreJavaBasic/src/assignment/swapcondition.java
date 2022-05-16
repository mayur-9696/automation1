package assignment;

public class swapcondition {
	int A=20;
	int B=30;
	int C=56;

	public static void main(String[] args) {
		System.out.println("program start");
		swapcondition m1=new swapcondition();
		double x=m1.A+m1.B;
		double y=m1.B+x;
		System.out.println("before");
		System.out.println("x value" +x);
		System.out.println("y value"+y);
		double temp=x;
		x=y;
		y=temp;
		System.out.println("After");
		System.out.println("x value"+x);
		System.out.println("y value"+y);
		System.out.println("end");
		
		

	}

}
