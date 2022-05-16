package array;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [5]; //declaration and instantiation
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		a[0]=05; //initialization
		a[1]=10;
		a[2]=20;
		a[3]=30;
		a[4]=40;
		System.out.println("after initialization****");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("array element count:"+a.length);
		System.out.println("normal for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			System.out.println("for each loop****");
			for(int num: a) {
				System.out.println(num);
				char getarray[]=new char[] {'A','B','C','D'};
			}
		}
		

	}

}
