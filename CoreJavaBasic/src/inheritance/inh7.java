package inheritance;
class vehicle1{
int wt=80;
double price=60000;
public void fourw() {
	System.out.println("vehicle1 wt"+this.wt);
	System.out.println("vehicle1 price"+price);
}
public void fourw(double wt0) {
	this.fourw();
	System.out.println("fourw wt"+wt0);
}
public void fourw(int wt1, float res) {
	this.fourw(75);
	System.out.println("wt"+wt1);
	System.out.println("res"+res);
}
}
class bike1 extends vehicle1{
	int bike1wt=85;
	bike1(){
			System.out.println("bike1111...");
			bike1wt=70;
		}
		public void test() {
			System.out.println("bike ok");
		}
	}
	class cycle extends bike1{
		int bike1wt;
		cycle(){
			System.out.println("cycle111 cons...");
			bike1wt=50;
		}
		public void test() {
			System.out.println("cycle ok");
		}
		public void change() {
			System.out.println("change part");
			System.out.println("bike1wt:"+bike1wt);
			System.out.println("bike1wt super:"+super.bike1wt);
			test();
			super.test();
	}
	}

public class inh7 {

	public static void main(String[] args) {
		cycle m=new cycle();
		m.change();
		vehicle1 f=new vehicle1();
		f.fourw(50,60);
}
}