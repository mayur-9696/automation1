package array;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age= {20,30,40,50};
		System.out.println("array element************");
		System.out.println("first ele:"+age[0]);
		System.out.println("second ele:"+age[1]);
		System.out.println("third ele:"+age[2]);
		System.out.println("fourth ele:"+age[3]);
		System.out.println("length ele:"+age.length);
		System.out.println("for loop*****************");
		for(int i=0;i<age.length;i++) {
			System.out.println("for loop ele:"+age[i]);
			System.out.println("if else**************");
			if(age[i]==25) {
				System.out.println(+age[i]);
				break;
			}else {
					System.out.println("age is not 25");
					
				}
			System.out.println("for each loop********");
			for(int a: age) {
				System.out.println(+a);
			}
//			if(a==25) {
//				System.out.println(+a);
//				break;
//			}else {
//				System.out.println("age is not 25");
//			}
		}

	}
}
