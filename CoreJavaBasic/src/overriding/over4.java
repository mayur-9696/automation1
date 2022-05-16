package overriding;
class parent{
	 void m1() {
		System.out.println("p m1 running");
	}
	public void m2() {
		System.out.println("p m2 running");
	}
}
class child extends parent{
	 void m1() {
		System.out.println("c m1 running");
	}
	public void m2() {
		System.out.println("c m2 running");
	}
}

public class over4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child m=new child();
		m.m2();
		m.m1();
		parent p=new parent();
		p.m1();
		p.m2();

	}

}
