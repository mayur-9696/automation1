package overriding;
class A{
	public void animal(int a) {
		System.out.println("animal A:"+a);
	}
	void display() {
		System.out.println("display sub class");
	}
}
class B extends A{
	public void animal(int a) {
		System.out.println("animal B:"+a);
		display();
		super.animal(10);
	}
	void dog(int a) {
		System.out.println("dog value:"+a);
	}
}
class C extends B{
	public void animal(int a) {
		System.out.println("animal C:"+a);
		dog(20);
		super.animal(30);
		
	}
	void cat() {
		System.out.println("cat can run");
	}
}


public class over {

	public static void main(String[] args) {
		C a=new C();
		a.animal(40);
		a.cat();
		
		

	}

}
