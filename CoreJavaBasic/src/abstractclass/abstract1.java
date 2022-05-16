package abstractclass;
abstract class Demo3 {
	abstract void print();//abstract method/incomplete method
	void display() {// normal or non-abstract or concrete method or complete method
		System.out.println("I am a non-abstract method display()..");
	}
}
abstract class Demo {
	void display() {
		System.out.println("I am a non-abstract method display()..");
	}
	void display2() {
		System.out.println("I am a non-abstract method display()..");
	}
}
abstract class Demo2 {
	abstract void print();
	abstract void print1();
	abstract void print2();
}

public class abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
