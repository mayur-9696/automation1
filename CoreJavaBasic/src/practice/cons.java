package practice;

public class cons {
    cons(){
		System.out.println("zero p");
	}
	cons(char c){
		System.out.println("single");
	}
	cons(int num1,int num2){
		System.out.println("int,int");
	}
	cons(double num1,int num2){
		System.out.println("double int");
	}
	public static void main(String args[]) {
		cons c1=new cons();
		cons c1=new cons('d');
		cons c1=new cons(10,20);
		cons c1=new cons(10d,20);
		
}
}
	