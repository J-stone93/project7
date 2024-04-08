package array.quiz;

import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		
		int cnt = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
				arr[cnt] = i;  
				cnt++;  //cnt에 증감식을 써서 인덱스 0~4를 넣음
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
