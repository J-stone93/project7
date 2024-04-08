package array;

public class Ex2 {

	public static void main(String[] args) {

		// 3개 크기의 정수형 배열 생성
		int [] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
//		arr[3] = 40; runtime 오류 남
		
		int value = arr[1];
		System.out.println(value);
	}

}
