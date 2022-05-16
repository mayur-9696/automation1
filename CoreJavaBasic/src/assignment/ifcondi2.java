package assignment;

public class ifcondi2 {

	public static void main(String[] args) {
		int a=40,b=46,c=50;
		if(a>=b&&a>=c) {
			System.out.println("largest number" +a);
		}
		else if(b>=a&&b>=c) {
			System.out.println("largest number" +b);
		}
		else if(c>=a&&c>=b) {
			System.out.println("largest number" +c);
		}
		else{
			System.out.println("no largest number");
		}

	}

}
