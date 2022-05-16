package inheritance;
class fruit{
	fruit(){
		System.out.println("fruits class cons..");
	}
	public void test() {
		System.out.println("fruits are sweets");
	}
}
class apple extends fruit{
	apple(){
		System.out.println("apple class cons...");
	}
	public void shape() {
		System.out.println("apple is round");
	}
}

public class inh3 {

	public static void main(String[] args) {
		apple fr=new apple();
		fr.test();
		fr.shape();

	}

}
