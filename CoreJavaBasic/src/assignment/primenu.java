package assignment;

public class primenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=7,i;
//		boolean temp=false;
//		for (i=2;i<=num/2;i++) {
//			if (num%i==0) {
//				temp=true;
//				break;
//			}
//		}
//		if(!temp) {
//			System.out.println("prime number");
//		}
//			else {
//				System.out.println("not prime number" );
//			}
		int num=5;
		int check=0;
		if(num==0||num==1) {
			System.out.println(num+" is not a prime no");
		}else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					System.out.println(num+" is not a prime no");
					check=1;
					break;
				}
			}
			if(check==0) {
				System.out.println(num+" is a prime no");
			}
		}
			
}}