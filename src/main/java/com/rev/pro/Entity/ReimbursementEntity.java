package com.rev.pro.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="ReimbursementDetails")
public class ReimbursementEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ReimbursementId")
	private Integer ReimbursementId;
	
	@Column(name="Type")
	private String type;
	@Column(name="Amount")
	private Double amount;
	
	@Column(name="Status")
	private String status;
	
	@ManyToOne
	private EmployeeEntity employee;

	@Override
	public String toString() {
		return "ReimbursementEntity [ReimbursementId=" + ReimbursementId + ", type=" + type + ", amount=" + amount
				+ ", status=" + status + ", employee=" + employee + "]";
	}

	public Integer getReimbursementId() {
		return ReimbursementId;
	}

	public void setReimbursementId(Integer reimbursementId) {
		ReimbursementId = reimbursementId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setEmployee(EmployeeEntity employee) {
		this.employee=employee;
	}
	public EmployeeEntity getEmployee() {
		return employee;
	}
	
	
}
