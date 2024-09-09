package ObjectExample;

class Student implements Cloneable{
	String studName = "Santosh", rollNo = "13";

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "student [studName=" + studName + ", rollNo=" + rollNo + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println(s1);
		try {
			Student s2 = (Student) s1.clone();
			System.out.println(s2);
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
	}
}
