package array.quiz;

import java.util.Arrays;

public class Quiz8 {

	public static void main(String[] args) {

		Student[] students = new Student[3];
		
		
		students[0] = new Student(1001, "둘리");
		students[1] = new Student(1002, "도우너");
		students[2] = new Student(1003, "또치");
		
		for (int i = 0; i < students.length; i++) {
			students[i].showInfo();
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
	
	public void showInfo() {
		System.out.println("학번: " + studentID + "이름: " + studentName);
	}
	
}