package arraylist.quiz;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true);
		list.add(true);
		list.add(false);
		
		for (int i = 0; i < list.size(); i++) {
			boolean bool = list.get(i);
			System.out.print(bool + " ");
		}
		System.out.println();
		
		for (Boolean bool : list) {
			System.out.print(bool + " ");
		}
		
		System.out.println();
		
		boolean bool1 = list.get(0);
		System.out.print("첫번째 요소: " + bool1 + " ");
		
		int lastIndex = list.size() - 1;
		System.out.println("마지막 요소: " + list.get(lastIndex));
		
	}

}
