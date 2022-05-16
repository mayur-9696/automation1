package assignment;

public class factorpositive {

	public static void main(String[] args) {
		int num=52;
		for (int i = 1; i<=num; i++) {
			if (num%i==0) {
				
				System.out.print(i+",");
			}
		}
		System.out.println("\n***********************");
		int num1=-45;
		for (int i = num1; i<=Math.abs(num1); i++) {
			if (i==0) {
				continue;
			}else
				if(num1%i==0)
				System.out.print(i+",");
			}}}