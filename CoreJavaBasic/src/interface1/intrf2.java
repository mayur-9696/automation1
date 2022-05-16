package interface1;
public class intrf2 {
interface printable{
	int age=30;
	void print();
}
interface showable{
	public void show1();
}
public class interface91 implements printable,showable{
	public static int age=45;
	public void print() {
		System.out.println("hello,print");
	}
	public void show1() {
		System.out.println("welcome,show");
}
}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface91 obj=new interface91();
		obj.print();
		obj.show1();
		System.out.println(printable.age)
		System.out.println(interface91.age)

	}
}