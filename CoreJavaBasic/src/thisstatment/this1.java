package thisstatment;

public class this1 {
	int rollno;
	double fee;
	this1(int rollno,double fee){
		this.rollno=rollno;
		this.fee=fee;
	}
	this1(int rollno,float fee){
		this.rollno=rollno;
		this.fee=fee;
	}
	this1(int rollno){
		this.rollno=rollno;
	}
	void display() {
		System.out.println(rollno+" "+fee);
	}

	public static void main(String[] args) {
		System.out.println("start");
		this1 s1=new this1(111,5000);
		System.out.println(s1.rollno+" "+s1.fee);
		System.out.println("s2 object");
		this1 s2=new this1(112,6000);
		System.out.println(s2.rollno+" "+s2.fee);
		this1 s3=new this1(200);
		System.out.println(s3.rollno+" "+s3.fee);
		s1.display();
		s2.display();
		
	}

}
