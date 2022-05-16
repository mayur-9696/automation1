package inheritance;
class Grandfather {
	Grandfather() {
		System.out.println("I am Class Grandfather constrctuor...");
	}
	void myHome() {
		System.out.println("I am home of Grandfather");
	}
}
class Father extends Grandfather {
	Father(double d) {
		super();
		System.out.println("I am Class Father constrctuor...");
	}
	void myCar() {
		System.out.println("I am car of Father");
	}
}
class Child1 extends Father {
	Child1(int i) {
		super(12.34);
		System.out.println("I am Class Child constrctuor...");
	}
	void myBike() {
		System.out.println("I am bike of child");
	}
}
public class enh5 {
	public static void main(String[] args) {
		System.out.println("*******************************************");
		Child1 c1 = new Child1(21);
		c1.myHome();
		c1.myCar();
		c1.myBike();
		System.out.println("*******************************************");
		Father f1 = c1;
		f1.myHome();
		f1.myCar();
		System.out.println("*******************************************");
		Grandfather g1 = c1;
		g1.myHome();
		System.out.println("*******************************************");
		Grandfather g2 = new Father(12.36);
		g2.myHome();
	}

}
