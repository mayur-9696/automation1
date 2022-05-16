package day2.variable;

public class Globalvariable2 {
static int empId=123;//static global variable or class variable
	
	public static void main(String[] args) {
		int empId=100,age=30;//local Variable
		
		System.out.println("Local Variable, EmpID: "+empId);//100
		System.out.println("Local Variable, Age: "+age);//30
		System.out.println("Standard way to access SGV, EmpID: "+GlobalVariable2.empId);//123
			
	}

	}

}
/*package day1.variables;

public class GlobalVariable2 {
	//Global Variable
	static double empId=123;//static global variable or class variable
	
	public static void main(String[] args) {
			System.out.println("Standard way to access SGV, EmpID: "+GlobalVariable2.empId);
			System.out.println("Direct way to access SGV, EmpID: "+empId);
	}

}


