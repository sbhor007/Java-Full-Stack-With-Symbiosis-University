package hasAStudentTeacher;

import java.util.Scanner;

public class Teacherstudent {
	
	static Student createStudent() {
		Scanner scan = new Scanner(System.in);
		String studId,StudName,className;
		
		System.out.println("Enter Student Id : ");
		studId = scan.next();
		
		
		System.out.println("Enter Student Name : ");
		StudName = scan.next();
		
		System.out.println("Enter Student class Name : ");
		className = scan.next();
		
		Student stud = new Student();
		stud.setStudId(studId);
		stud.setStudName(StudName);
		stud.setClassName(className);
		
		return stud;
		
	}
	
	static Teacher createTeacher() {
		Scanner scan = new Scanner(System.in);
		
		String teacherName, subjectName;
		
		System.out.println("Enter Teacher Name : ");
		teacherName = scan.next();
		
		System.out.println("Enter Subject : ");
		subjectName = scan.next();
		
		Teacher t = new Teacher();
		t.setSubjectName(subjectName);
		t.setTeacherName(teacherName);
		
		return t;
		
	}

	public static void main(String[] args) {
		Student s1 = createStudent();
//		Student s2 = createStudent();
		
		Teacher t1 = createTeacher();
		System.out.println(t1 + " Teach " +  s1);
		
		

	}

}
