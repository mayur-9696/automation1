package casting;

public class casting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=65000;
		double salarydouble=(double)salary;
		float salaryfloat=(float)salary;
		System.out.println("explicit widening");
		System.out.println("salary:"+salary+"/nsalarydouble:"+salarydouble+"/nsalaryfloat:"+salaryfloat);
		System.out.println("implicit widening");
		double salarydouble2=salary;
		float salaryfloat2=salary;
		System.out.println("salary:"+salary+"/nsalarydouble2"+salarydouble2+"/nsalaryfloat2:"+salaryfloat2);
		double salarydb=75998.8779d;
		int salaryint=(int)salarydb;
		float salaryfloat1=(float)salarydb;
		System.out.println("*******explicit narrowing*****");
		System.out.println("salarydb:"+salarydb+"/nsalaryint"+salaryint+"salaryfloat:"+salaryfloat1);
		
		

	}

}
