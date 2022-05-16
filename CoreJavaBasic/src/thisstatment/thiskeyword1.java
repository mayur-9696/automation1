package thisstatment;

public class thiskeyword1 {
	int variable = 5;	
	int age=10;
	public static void main(String args[]) {
		thiskeyword1 obj = new thiskeyword1();
		obj.method(20);
		obj.method();	
		System.out.println("obj GV variable: "+obj.variable);//
		thiskeyword1 obj2 = new thiskeyword1();
		System.out.println("obj2 GV variable: "+obj2.variable);//
	}
	void method(int variable) {
	//	System.out.println("Value of variable :" + variable);//20
		System.out.println("GV Value of variable :" + this.variable);//5
		this.variable=variable;
		System.out.println("Value of variable :" + variable);//20
		System.out.println("GV Value of variable :" + this.variable);//20
	}
	void method() {
		int variable = 40;
		System.out.println("Value of variable :" + variable);
	}
}