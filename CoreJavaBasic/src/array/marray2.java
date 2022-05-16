package array;

public class marray2 {

	public static void main(String[] args) {
		int[] from= {1,2,3,4,5,6,7,8,9};
		int[] m=new int[5];
		System.arraycopy(from,3, m,0,m.length);
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i]);
		
		}

	}

}
