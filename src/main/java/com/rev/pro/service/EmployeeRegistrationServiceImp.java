package com.rev.pro.service;

import java.util.List;
import java.util.logging.Logger;

import com.rev.pro.Entity.EmployeeEntity;
import com.rev.pro.Entity.ReimbursementEntity;
import com.rev.pro.dao.EmployeeRegistrationDao;
import com.rev.pro.dao.EmployeeRegistrationDaoImp;
import com.rev.pro.model.EmployeeDetails;
import com.rev.pro.model.ReimbursementDetails;



public class EmployeeRegistrationServiceImp implements EmployeeRegistrationService{
	static Logger logger = Logger.getLogger("Detailsemployee.class");
	
	EmployeeRegistrationDao Dao = new EmployeeRegistrationDaoImp();
	 public void addEmployee(EmployeeDetails e) {
		 
		 logger.info("=============================== add Employee Details Services ==================================");
		 Dao.addEmployee(e);
		 
	 }
	 
	 public List<EmployeeEntity> displayAllEmployees(){
		 logger.info("=============================== Display All Employee Services ==================================");
		 return Dao.displayAllEmployees();
	 }
	 
	 public void addreimdetails(ReimbursementDetails rd) {
		 logger.info("=============================== Reimbursument Details Services ==================================");
		 Dao.addreimdetails(rd);
	 }
	 
	 
	 public List<ReimbursementEntity> displayreimdetailsofemp(String id)
		{
		 logger.info("=============================== Reimbursement Entity Services ==================================");
			return Dao.displayreimdetailsofemp(id);
		}
	 
	public  List<ReimbursementEntity> rebdetails(String id){
		logger.info("===============================  Reimbursement Entity view  Service  ==================================");
		 return Dao.rebdetails(id);
	 }
	
	
	public List<EmployeeEntity> DetailsEmployee(String id){
		logger.info("=============================== Details Employee Service  ==================================");
		return Dao.DetailsEmployee(id);
	}
	
	
	public List<ReimbursementEntity> viewAllEmpRequest(){
		
		
		logger.info("=============================== View All EMployeee Request  Serivces ==================================");
		return Dao.viewAllEmpRequest();
	}
	
	
	public List<ReimbursementEntity> viewAllpending(){
		logger.info("=============================== Manager view pending Services ==================================");
		return Dao.viewAllpending();
	}
	
	
	public void ManagerUpdateRequest(Integer reimbursementId,String status) {
		logger.info("===============================Manager Update request Services  ==================================");
		Dao.ManagerUpdateRequest(reimbursementId,status);
	}
	
	
	public List<ReimbursementEntity> viewonlyaccept(){
		logger.info("=============================== Manager view Accept Services==================================");
		return Dao.viewonlyaccept();
	}
	
	
	public List<ReimbursementEntity> viewonlyreject(){
		logger.info("=============================== Manager view Reject Services   ==================================");
		return Dao.viewonlyreject();
	}
	public void UpdateEmployee(EmployeeDetails employee) {
		logger.info("===============================Employee Update Values Services   ==================================");
		Dao.UpdateEmployee(employee);
	}
	
}
