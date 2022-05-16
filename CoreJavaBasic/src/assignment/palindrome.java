package assignment;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12121,reversednum=0,remainder;
		int originalnum=num;
		while(num!=0) {
			remainder=num%10;
			reversednum=reversednum*10+remainder;
			num/=10;
		}
		if(originalnum==reversednum) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is not palindrome");
		}

	}

}

		