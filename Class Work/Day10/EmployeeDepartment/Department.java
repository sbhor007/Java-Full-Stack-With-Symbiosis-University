package EmployeeDepartment;

public class Department {
	
	private String deptId,deptName;
	
//	public Department() {}
//	public Department(String deptId, String deptName) {
//		super();
//		this.deptId = deptId;
//		this.deptName = deptName;
//	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
	

	
	
	

}
