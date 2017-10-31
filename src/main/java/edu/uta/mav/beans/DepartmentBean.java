package edu.uta.mav.beans;

public class DepartmentBean {
	private int departmentId;
	private String departmentName;
	private String departmentContactPerson;
	public DepartmentBean(){
	}
	public DepartmentBean(int departmentId, String departmentName,
			String departmentContactPerson) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentContactPerson = departmentContactPerson;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentContactPerson() {
		return departmentContactPerson;
	}
	public void setDepartmentContactPerson(String departmentContactPerson) {
		this.departmentContactPerson = departmentContactPerson;
	}
	@Override
	public String toString() {
		return "DepartmentBean [departmentId=" + departmentId
				+ ", departmentName=" + departmentName
				+ ", departmentContactPerson=" + departmentContactPerson + "]";
	}
	
}
