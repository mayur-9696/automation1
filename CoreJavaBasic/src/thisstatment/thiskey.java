package thisstatment;

public class thiskey {
	int variable=5;
	int age=10;
	

	public static void main(String[] args) {
		thiskey obj=new thiskey();
		obj.method(20);
		obj.method();
		System.out.println("111**" +obj.variable);
		thiskey obj2=new thiskey();
		System.out.println("22222**" +obj2.variable);

	}
	void method(int variable) {
		System.out.println("3333**" +this.variable);
		this.variable=variable;
		System.out.println("4444**" +variable);
		System.out.println("55555**" +this.variable);
	}
	void method() {
		int variable=40;
		System.out.println("66666**" +variable);
	}

}
