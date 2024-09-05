
public class Student {
	
	int rollNo;
	String studName;
	public Student() {}
	public Student(int rollNo) {
		this.rollNo = rollNo;
	}
	public Student(String studName) {
		this.studName = studName;
	}
	public Student(int rollNo,String studName) {
		this.rollNo = rollNo;
		this.studName = studName;
	}
	
	public void ragistation() {
		System.out.println("no arg method");
	}
	
	public void ragistation(int rollNo) {
		this.rollNo = rollNo;
		System.out.println("ragistation with roll number");
	}
	public void ragistation(String stuName) {
		this.studName = studName;
		System.out.println("ragistation with Name Only");
	}
	
	public void ragistation(int rollNo,String stuName) {
		this.rollNo = rollNo;
		this.studName = studName;
		System.out.println("ragistation with roll number and Name");
	}	

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
