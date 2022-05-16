package practice;

public class construction {
	construction(){
		System.out.println("this is zero const");
	}
	construction(int age,int id,char c){
		System.out.println("this age, id,c const");
	}
	construction(char c){
		System.out.println("c");
	}
	construction( int age,char c){
		System.out.println("age,c");
	}

	public static void main(String[] args) {
		construction c1=new construction(10,20,'B');
		construction c2=new construction('C');
		construction c3=new construction(40,'D');
		construction c4=new construction('E');
		}

	}
