package array;

public class marray1 {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5},{6,7,8,9}};
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println(arr[i][j]+" ");
		}
		System.out.println();
		}
		char arr1[][]= {{'a','b','c'},{'d','e'},{'f','g','h'}};
		for(char i=0;i<arr1.length;i++) {
		  for(char j=0;j<arr1[i].length;j++) {
			  System.out.println(arr1[i][j]+" ");
		  }
		  System.out.println();
		}
	}

}
