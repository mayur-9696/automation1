package practice;

public class cons1 {

	cons1(){
		System.out.println("zero p");
	}
	cons1(char c){
		System.out.println("single");
	}
	cons1(int num1,int num2){
		System.out.println("int,int");
	}
	cons1(double num1,int num2){
		System.out.println("double int");
	}
	public static void main(String args[]) {
		cons1 c1=new cons1(10,20);
		cons1 c2=new cons1();
		cons1 c3=new cons1('d');
		cons1 c4=new cons1('s',30);
		cons1 c5=new cons1(10d,20);
		
}
}
	