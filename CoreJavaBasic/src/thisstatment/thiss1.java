package thisstatment;

public class thiss1 {
	int rollno;
	float fee;
	thiss1(int rollno){
		this.rollno=rollno;}
	thiss1(int rollno,float fee){
		this(rollno);
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+fee);
		
	}

	public static void main(String args[]) {
		System.out.println("**********************Creating S1 object***************************");
		thiss1 s1 = new thiss1(111);//
		System.out.println(s1.rollno + " " + s1.fee);
		System.out.println("**********************Creating S2 object***************************");
		thiss1 s2 = new thiss1(112, 6000f);
		System.out.println(s2.rollno + " " + s2.fee);
		System.out.println("*****************Display()*************************");
		s1.display();
		s2.display();
	}}