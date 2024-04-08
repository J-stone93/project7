package array.quiz;

import java.util.Arrays;

public class Quiz7 {

	public static void main(String[] args) {

		char[] srcArr = {'a', 'b', 'c', 'd', 'e'};
		
		char[] newArr = new char[2];
		
		System.arraycopy(srcArr, 3, newArr, 0, 2);
		
		System.out.println(Arrays.toString(srcArr));
		
		System.out.println(Arrays.toString(newArr));
		
	}

}
