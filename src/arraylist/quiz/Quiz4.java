package arraylist.quiz;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student(1001, "둘리"));
		list.add(new Student(1002, "또치"));
		list.add(new Student(1003, "도우너"));

		for (Student student : list) {

			student.showStudentInfo();
		}
		
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			
			Student student = list.get(i);
			student.showStudentInfo();
		}
	}

}

class Student {

	int studentID;
	String studentName;

	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public void showStudentInfo() {
		System.out.println("학번: " + studentID + " " + "이름: " + studentName);
	}

}