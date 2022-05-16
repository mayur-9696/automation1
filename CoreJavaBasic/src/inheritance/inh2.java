package inheritance;
class A1{
	static int a=10;
	int b=20;
	double c=13.45;
}
class B1 extends A1{
	static int x=30;
	int y=40;
	double z=53.45;
}
class C1 extends B1{
	static int p=50;
	int q=60;
	double r=66.45;
}

public class inh2 {

	public static void main(String[] args) {
		System.out.println("********static variable******");
		System.out.println("class A static variale:"+A.a);
		System.out.println("class B static variale:"+B.x);
		System.out.println("class C static variale:"+C.p);
		System.out.println("*******non static***************");
		C1 c1=new C1();
		System.out.println("with refer C class:"+c1.b);
		System.out.println("with refer C class:"+c1.c);
		System.out.println("with refer C class:"+c1.q);
		System.out.println("with refer C class:"+c1.r);
		System.out.println("with refer C class:"+c1.y);
		System.out.println("with refer C class:"+c1.z);
		System.out.println("*************************");
		B1 b1=new B1();
		System.out.println("with refer B class:"+b1.b);
		System.out.println("with refer B class:"+b1.c);
		System.out.println("with refer B class:"+b1.y);
		System.out.println("with refer B class:"+b1.z);
		

	}

}
