package encapsulation;

class demo11{
	private int empid=123;
	private double salary=45000;
	//getter method
	public int getempid(){
	return empid;
	}
	public double getsalary() {
		return salary;
	}
	//setter method
	public void setEmpID(int e) {
		empid=e;
		System.out.println("EmpID is update now...");
	}
	public void setsalary(double salary) {
		this.salary=salary;
		System.out.println("salary is update now..");
	}
}
	public class encpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo11 d1=new demo11();
		System.out.println("Accessing private data member outside the class using getter concept- empID: "+d1.getempid());
		System.out.println("Accessing private data member outside the class using getter concept- salary: "+d1.getsalary());
		System.out.println("*****************Updating private data members*************************");
		d1.setEmpID(1001);
		d1.setsalary(550000);
		System.out.println("Updated, Accessing private data member outside the class using getter concept- empID: "+d1.getempid());
		System.out.println("Updated, Accessing private data member outside the class using getter concept- salary: "+d1.getsalary());
		System.out.println("***********************************");
		demo11 d2=new demo11();
		System.out.println("Accessing private data member outside the class using getter concept- empID: "+d2.getempid());
		System.out.println("Accessing private data member outside the class using getter concept- salary: "+d2.getsalary());
		

	}

}
