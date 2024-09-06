package hasAStudentTeacher;

public class Teacher {
	private String teacherName, subjectName;

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", subjectName=" + subjectName + "]";
	}
	
	
}
