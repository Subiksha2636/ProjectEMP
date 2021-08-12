package com.rev.pro.service;

import java.util.List;

import com.rev.pro.Entity.EmployeeEntity;
import com.rev.pro.Entity.ReimbursementEntity;
import com.rev.pro.dao.EmployeeRegistrationDao;
import com.rev.pro.dao.EmployeeRegistrationDaoImp;
import com.rev.pro.model.EmployeeDetails;
import com.rev.pro.model.ReimbursementDetails;



public class EmployeeRegistrationServiceImp implements EmployeeRegistrationService{
	//EmployeeRegistrationDao  Dao=new EmployeeRegistrationDaoImp();
	EmployeeRegistrationDao Dao = new EmployeeRegistrationDaoImp();
	 public void addEmployee(EmployeeDetails e) {
		 Dao.addEmployee(e);
		 
	 }
	 public List<EmployeeEntity> displayAllEmployees(){
		 return Dao.displayAllEmployees();
	 }
	 public void addreimdetails(ReimbursementDetails rd) {
		 Dao.addreimdetails(rd);
	 }
	 public List<ReimbursementEntity> displayreimdetailsofemp(String id)
		{
			return Dao.displayreimdetailsofemp(id);
		}
	 
	public  List<ReimbursementEntity> rebdetails(String id){
		 return Dao.rebdetails(id);
	 }
	public List<EmployeeEntity> DetailsEmployee(String id){
		return Dao.DetailsEmployee(id);
	}
	public List<ReimbursementEntity> viewAllEmpRequest(){
		return Dao.viewAllEmpRequest();
	}
	public List<ReimbursementEntity> viewAllpending(){
		return Dao.viewAllpending();
	}
	public void ManagerUpdateRequest(Integer reimbursementId,String status) {
		Dao.ManagerUpdateRequest(reimbursementId,status);
	}
	public List<ReimbursementEntity> viewonlyaccept(){
		return Dao.viewonlyaccept();
	}
	public List<ReimbursementEntity> viewonlyreject(){
		return Dao.viewonlyreject();
	}
}
