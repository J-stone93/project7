package arraylist;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		for (int i = 0; i < list.size(); i++) { //list는 배열과 다르게 length가 아닌 size 함수를 사용
			
			int num =  list.get(i); //list.get list 안에 요소 빼내오기
			System.out.print(num + " ");
		}
		
	}

}
