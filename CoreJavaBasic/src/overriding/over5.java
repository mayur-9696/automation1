package overriding;
class parent3{
	void show() {
		System.out.println("p show");
	}
}
class child1 extends parent3{
	void show() {
		System.out.println("c show");
		super.show();
	}
}
class grand extends child1{
	void show() {
		System.out.println("g show");
		super.show();
	}
}

public class over5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent3 a=new grand();
		a.show();

	}

}
