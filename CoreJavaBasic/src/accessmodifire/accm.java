package accessmodifire;

public class accm {
	int age=90;
	void displayage() {
		System.out.println("age:"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accm a=new accm();
		System.out.println(a.age);
		a.displayage();
		

	}

}
class accessdefaultmember {
	public static void main(String[] args) {
		accessdefaultmember a=new accessdefaultmember();
		System.out.println(a.age);
		a.displayage();
		
	}
}
