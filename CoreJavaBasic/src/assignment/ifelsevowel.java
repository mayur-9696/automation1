package assignment;

public class ifelsevowel {

	public static void main(String[] args) {
		System.out.println("vowel is below");
		for(char i='A';i<'Z';i++) {
			if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U') {
			System.out.print(i+",");
		}
		}
		System.out.println("consonent below");
		for(char i='A';i<'Z';i++) {
			if(!(i=='A')||(i=='E')||(i=='I')||(i=='O')||(i=='U')) {
			System.out.print(i+",");
		}
			
		}
	}
	}
