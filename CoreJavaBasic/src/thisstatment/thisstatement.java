package thisstatment;

public class thisstatement {
	thisstatement(){
		System.out.println("*****zero para****");
	}
	thisstatement(int age){
		System.out.println("*****int age****");
	}
	thisstatement(char c,double d){
		System.out.println("*****char double****");
	}

	public static void main(String[] args) {
		thisstatement t1=new thisstatement('b',77);
		thisstatement t2=new thisstatement(25);
		thisstatement t3=new thisstatement('c',25.36);
		

	}

}
