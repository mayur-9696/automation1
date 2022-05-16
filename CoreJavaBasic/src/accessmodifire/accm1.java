package accessmodifire;

public class accm1 {
	 int num1 = 10;
	int num2 = 20;
	 int num3 = 30;
	 int num4 = 40;

	public static void main(String[] args) {

		accm1 m1 = new accm1();
		System.out.println("private variable: " + m1.num1);
		System.out.println("default variable: " + m1.num2);
		System.out.println("protected variable: " + m1.num3);
		System.out.println("public variable: " + m1.num4);
	}
}
class Accessaccm1{
	public static void main(String[] args) {

		accm1 m2 = new accm1();
		//System.out.println("private variable: " + m1.num1);
		System.out.println("default variable: " + m2.num2);
		System.out.println("protected variable: " + m2.num3);
		System.out.println("public variable: " + m2.num4);
	}
}
