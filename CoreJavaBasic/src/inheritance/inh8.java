package inheritance;
class company{
	int age=20;
	double salary=55000;
	public void newcom() {
		System.out.println("age: "+this.age);
		System.out.println("salary"+salary);
	}
	public void newcom(int age) {
		this.newcom();
		System.out.println("newcomp age:"+age);
	}
	public void newcomp(int age,double salary) {
		this.newcom(25);
		System.out.println("age:"+age);
		System.out.println("salary"+salary);
	}
}
class emp extends company{
	int age=57;
	double salary=40000;
	public void car() {
		super.newcomp(67,80000d);
		System.out.println("car is running");
		salary=60000;
	}
	emp(){
		System.out.println("my name is ");
	}
		public void car(int age) {
			this.car();
			System.out.println("int car"+age);
		}
		public void car(int age,double salary) {
			this.car(45);
			System.out.println("int,double"+age);
			System.out.println("int,double"+salary);
			System.out.println("int,double"+super.salary);
		}
	}


public class inh8 {

	public static void main(String[] args) {
		emp c1=new emp();
		
		
		c1.car(30,65000d);
		

	}

}
