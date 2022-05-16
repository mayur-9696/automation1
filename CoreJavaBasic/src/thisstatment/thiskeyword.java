package thisstatment;

public class thiskeyword {

	int x;
	// Constructor with a parameter
	public thiskeyword(int x) {
		System.out.println("Local variable x: "+x);
		System.out.println("Global variable x: "+this.x);
		this.x = x;
		System.out.println("Local variable x: "+x);
		System.out.println("Global variable x: "+this.x);
	}
	// Call the constructor
	public static void main(String[] args) {
		thiskeyword myObj = new thiskeyword(45);
		System.out.println("Value of x = " + myObj.x);//
	}
}