package arraylist.quiz;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		
		for (String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		//뒤에서 부터 삭제 (권장)
		list.remove(4);
		list.remove(3);
		list.remove(2);
		list.remove(1);
		list.remove(0);
		
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i--);
//		}
//		System.out.println(list);
	}

}
