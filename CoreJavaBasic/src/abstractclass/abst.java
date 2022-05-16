package abstractclass;
abstract class bike1{
	abstract void run();
	void speed (int spd) {
		System.out.println("bike speed:"+spd);
	}
	
}
class honda extends bike1{
	void run() {
		System.out.println("running safe");
	}
	void speed (int spd) {
		System.out.println("honda speed:"+spd);
		super.speed(120);
	}
	void color() {
		System.out.println("honda color is blue");
	}
}

public class abst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		honda obj=new honda();
		obj.speed(60);
		obj.color();
		bike1 b2=new honda();
		b2.run();
		b2.speed(20);

	}

}
