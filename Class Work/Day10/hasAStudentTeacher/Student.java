package hasAStudentTeacher;

public class Student {
	
	private String studId,StudName,className;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return StudName;
	}

	public void setStudName(String studName) {
		StudName = studName;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", StudName=" + StudName + ", className=" + className + "]";
	}
	
}
