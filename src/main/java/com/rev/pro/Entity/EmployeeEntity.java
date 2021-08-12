package com.rev.pro.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeEntity {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employeeId")
	private Integer employeeId;//composite
	@Column(name="password")
	private String password;
	@Column(name="employeeName")
	private String employeeName;
	@Column(name="designation")
	private String designation;
	@Column(name="department")
	private String department;
	@Column(name="email")
	private String email;
	//private String type;
	
	@OneToMany(mappedBy="employee")
	private List<ReimbursementEntity> reimbursementList;

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
	
	@Override
	public String toString() {
		return " [" + employeeId + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
	public List<ReimbursementEntity> getReimbursementList() {
		return reimbursementList;
	}
	public void setReimbursementList(List<ReimbursementEntity> reimbursementList) {
		this.reimbursementList = reimbursementList;
	}
	
}
