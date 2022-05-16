package inheritance;
class vehicle{
	public void wheels() {
		System.out.println("i have wheels");
	}
}
class bike extends vehicle{
	public void countwl() {
		System.out.println("i am bike and has 2 wheels");
	}
}
class car1 extends vehicle{
	public void countwlc() {
		System.out.println("i am a carand has 4 wheels" );
	}
}
class scooter extends vehicle{
	public void countwls() {
		System.out.println("i am ascooter and has 2 wheels");
	}
}

public class inh5 {

	public static void main(String[] args) {
		scooter sc=new scooter();
		sc.wheels();
		sc.countwls();
		car1 c=new car1();
		c.wheels();
		c.countwlc();
		bike b=new bike();
		b.wheels();
		b.countwl();
	}

}
