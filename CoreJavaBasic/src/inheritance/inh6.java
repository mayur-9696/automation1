package inheritance;
class fruits{
	int fruitage;
	fruits(){
		System.out.println("fruit class cons...");
		fruitage=7;
	}
	public void taste() {
		System.out.println("fruits are sweets");
	}
}
class orange extends fruits{
	int fruitage;
	orange(){
		System.out.println("orange class cons...");
		fruitage=5;
	}
	public void taste() {
		System.out.println("orange are sweets");
	}
	public void shape() {
		System.out.println("orange is round");
		System.out.println("orange fruitage:"+fruitage);
		System.out.println("orange fruitage:"+super.fruitage);
		taste();
		super.taste();
	}
}

public class inh6 {

	public static void main(String[] args) {
		orange o1=new orange();
		o1.shape();
		System.out.println("************************8");

	}

}
