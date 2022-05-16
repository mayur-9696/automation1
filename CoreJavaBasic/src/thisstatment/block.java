package thisstatment;

public class block {
	static int age=25;
	double salary=15000.32;
	void print() {
		System.out.println("age:"+age);
		System.out.println("salary:"+salary);
		
	}
	public static void main(String []args) {
		System.out.println("start");
		block b1=new block();
		b1.print();
		b1.salary=15000.32;
		b1.print();
		System.out.println("end");
	}
	static {
		age=35;
	}
}

	