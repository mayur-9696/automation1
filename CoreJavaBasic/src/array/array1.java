package array;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cars[]= {"volvo","Bmw","Ford","mazda"};
		System.out.println(cars[0]);
		cars[0]="oval";
		System.out.println(cars[0]);
		//array element count
		System.out.println(cars.length);
		//normal for loop
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars [i]);
			
		}
		

	}

}
