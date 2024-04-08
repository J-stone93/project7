package array.quiz;

import java.util.Arrays;

public class Quiz5 {

	public static void main(String[] args) {
		
		int[] arr = {5, 20, 100, 30, 77};
		
		int max = arr[0];
		
		for (int i = 1; i < 5; i++) {  //5개의 숫자를 4번만 비교하기 때문에 1~4 반복하게 만듬
			if (arr[i] > max) { //20 > 5은 조건에 만족하니깐 max변수에 20 저장하는함
				max = arr[i];	// 30> 100은 조건에 만족하지 못하므로 max변수에 100이 그대로임
			} 
			
			
		}System.out.println(max);
		
		
		
	}

}
