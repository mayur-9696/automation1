package thisstatment;

public class thiskey1 {
	int age=15;
	int no=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskey1 a=new thiskey1();
		a.method(20);
		a.method();
		System.out.println("111***"+a.age);
		thiskey1 a1=new thiskey1();
		System.out.println("222***"+a1.age);
	}
	void method(int age) {
		System.out.println("333***"+this.age);
		this.age=age;
		System.out.println("444***"+age);
		System.out.println("555***"+this.age);
	}
	void method() {
		System.out.println("666***"+age);
	}

}
