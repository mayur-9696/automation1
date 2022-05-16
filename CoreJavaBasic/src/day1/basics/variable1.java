package day1.basics;

public class variable1 {

static int empId=123;//static global variable or class variable
	
	public static void main(String[] args) {
		int empId=100,age=30;//local Variable
		
		System.out.println("Local Variable, EmpID: "+empId);//100
		System.out.println("Local Variable, Age: "+age);//30
		System.out.println("Standard way to access SGV, EmpID: "+variable1.empId);//123
			

	}

}
