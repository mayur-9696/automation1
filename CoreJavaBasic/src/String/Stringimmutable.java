package String;

final class immutable {
	final String name;
	final int salary;
	immutable(String s1,int num1){
		name=s1;
		salary=num1;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}	
}
public class Stringimmutable {

	public static void main(String[] args) {
		immutable t1=new immutable("Nitin",25000);
		System.out.println(t1.getName()+"   " +t1.getSalary());
		//System.out.println(t1.getSalary());
		//change its data variable value create new object
		immutable t2=new immutable("Nitin2",250003);
		System.out.println(t2.getName());
		System.out.println(t2.getSalary());
	}
}
