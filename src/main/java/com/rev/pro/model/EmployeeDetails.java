package com.rev.pro.model;

public class EmployeeDetails {
	private Integer employeeId;
	private String password;
	private String employeeName;
	private String designation;
	private String department;
	private String email;
	
	
	//private String type;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", password=" + password + ", employeeName=" + employeeName
				+ ", designation=" + designation + ", department=" + department + ", email=" + email + "]";
	}

}
