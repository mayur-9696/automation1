package accessmodifire;

public class defaultno1 {int accNum=12345;
void displayAccNum() {
	System.out.println("Account Number: "+accNum);
}
public static void main(String[] args) {
	
	defaultno1 p1=new defaultno1();
	System.out.println(p1.accNum);
	p1.displayAccNum();
}
}
class AccessDefaultMembers {

public static void main(String[] args) {
	
	defaultno1 p1=new defaultno1();
	System.out.println("Accessing Default members from child class");
	System.out.println(p1.accNum);
	p1.displayAccNum();
}
}
