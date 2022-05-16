package day2.globalvariable;

public class globalvariable {
	static double salary=56000;
    static int age=50;
	public static void main(String[] args) {
		int age=60;
		double salary=80000;
		System.out.println("program start");
		System.out.println("gvv: "+globalvariable.salary);
		System.out.println("gvv: "+globalvariable.age);
		System.out.println("local: "+age);
		System.out.println("local: "+salary);
		System.out.println("program ends");
		

	}

}
