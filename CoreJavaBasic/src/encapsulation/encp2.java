package encapsulation;


	class mayur1{
	 int age=45;
	 double salary=77000;
	public int getage() {
		return age;
	}
		public double getsalary() {
			return salary;
		}
			public void setage(int a) {
				age=a;
				System.out.println("age is update now..");
			}
				public void setsalary(double s) {
					salary=s;
					System.out.println("salary update now...");
					
				}
	}
	public class encp2 {
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mayur1 m=new mayur1();
		System.out.println("age:"+m.getage());
		System.out.println("salary:"+m.getsalary());
		m.setage(90);
		m.setsalary(55000);
		System.out.println("update age:"+m.getage());
		System.out.println("update salary:"+m.getsalary());
		

	}

}
