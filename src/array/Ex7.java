package array;

public class Ex7 {

	public static void main(String[] args) {

		int[][] arr = { {2, 4, 6} , {3, 6, 9} };
		
		int[][] arr1 = new int[2][3];
		
		// i는 행 인덱스 j는 열 인덱스
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}














