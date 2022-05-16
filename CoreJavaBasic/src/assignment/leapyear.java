package assignment;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=1000;
		if((year%4==0)&&(year%100!=0)||(year%400==0)) {
			System.out.println("* this year is leap year");
		}
		
		else {
			System.out.println("this year is not leap year");
		}

	}}


