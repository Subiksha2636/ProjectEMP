package com.rev.pro.service;

import java.util.List;

import com.rev.pro.Entity.EmployeeEntity;
import com.rev.pro.Entity.ReimbursementEntity;
import com.rev.pro.model.EmployeeDetails;
import com.rev.pro.model.ReimbursementDetails;

public interface EmployeeRegistrationService {
	 public void addEmployee(EmployeeDetails e);
	 public List<EmployeeEntity> displayAllEmployees();
	public void addreimdetails(ReimbursementDetails rd);
	//employee part
	public List<ReimbursementEntity> displayreimdetailsofemp(String id);
	public List<ReimbursementEntity> rebdetails(String id);
	public List<EmployeeEntity> DetailsEmployee(String id);
	//manager part
	public List<ReimbursementEntity> viewAllEmpRequest();
	public List<ReimbursementEntity> viewAllpending();
	public void ManagerUpdateRequest(Integer reimbursementId,String status);
	public List<ReimbursementEntity> viewonlyaccept();
	public List<ReimbursementEntity> viewonlyreject();

}
