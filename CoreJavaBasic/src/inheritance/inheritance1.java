package inheritance;
class A{
	static int a=10;
	int b=20;
	double c=13.45;
}
class B{
	static int x=30;
	int y=40;
	double z=53.45;
}
class C{
	static int p=50;
	int q=60;
	double r=66.45;
}

public class inheritance1 {

	public static void main(String[] args) {
		System.out.println("********static variable******");
		System.out.println("class A static variale:"+A.a);
		System.out.println("class B static variale:"+B.x);
		System.out.println("class C static variale:"+C.p);
		System.out.println("*******non static***************");
		A a1=new A();
		System.out.println("class A non static variale B:"+a1.b);
		System.out.println("class A non static variale c:"+a1.c);
		B b1=new B();
		System.out.println("class B non static variale y:"+b1.y);
		System.out.println("class B non static variale z:"+b1.z);
		C c1=new C();
		System.out.println("class C non static variale q:"+c1.q);
		System.out.println("class C non static variale r:"+c1.r);

	}

}
