package casting;

public class Primitivecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=67000;
		double salary1=(double)salary;
		float salary2=(float)salary;
		System.out.println("***explicit windening***");
		System.out.println("salary:"+salary+"\nsalary1: "+salary1+"\nsalary2: "+salary2);
		//implicit windening or auto windening
		double salary11=salary;
		float salary22=salary;
		
		System.out.println("salary11:"+salary11+"\nsalary22: "+salary22);
		double salary0=55000;
		int salary01=(int)salary0;
		float salary02=(float)salary0;
		System.out.println("*****explicit narrowing****");
		System.out.println("salary0:"+salary0+"\nsalary01:"+salary01+"\nsalary02:"+salary02);
		//int salary01=salary0;
		//float salary02=salary0;
		double age=90;
		int age2=(int)age;
		System.out.println(+age2);

	}

}
