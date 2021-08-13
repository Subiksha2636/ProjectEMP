package com.rev.pro.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.rev.pro.Entity.EmployeeEntity;
import com.rev.pro.Entity.ReimbursementEntity;
import com.rev.pro.exception.CustomEmployeeException;
import com.rev.pro.model.EmployeeDetails;
import com.rev.pro.model.ReimbursementDetails;
import com.rev.pro.util.EmployeeMapper;
import com.rev.pro.util.HibernateUtil;
import com.rev.pro.util.ReimbursementMapper;



public class EmployeeRegistrationDaoImp implements EmployeeRegistrationDao {
	
	//EmployeeDetails
	public void addEmployee(EmployeeDetails e)throws CustomEmployeeException {
			
	
			
			try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				session.beginTransaction();  
				session.save(EmployeeMapper.mapEmployee(e));
				System.out.println("employee inserted...");
				session.getTransaction().commit();
				
			} catch (Exception e1) {
				
				throw new CustomEmployeeException("Invalid insert data");
			}
			 
		
			 
		 }
	
	//EmployeeEntity
	public List<EmployeeEntity> displayAllEmployees() throws CustomEmployeeException {
		List<EmployeeEntity> elist=new ArrayList<EmployeeEntity>();
		
	try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			Query q=session.createQuery("from EmployeeEntity e"); //native ,namedquery,hql
			elist=q.list();	
			
		} catch (Exception e1) {
			
			throw new CustomEmployeeException("Invalid insert data");
		}
		 
		return elist;
	}
	
	//reimbursementdetails 
	public void addreimdetails(ReimbursementDetails rd) {
		
	
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();  
			ReimbursementEntity r= ReimbursementMapper.mapReimEmployee(rd);
			EmployeeEntity ee=(EmployeeEntity)session.get(EmployeeEntity.class,Integer.parseInt(rd.getEmpid()));
			r.setEmployee(ee);
			session.save(r);
			System.out.println("employee inserted...");
			session.getTransaction().commit();
			
		} catch (Exception e1) {
			
			throw new CustomEmployeeException("Invalid insert data");
		}
	}
		//ReimbursementEntity
		public List<ReimbursementEntity> displayreimdetailsofemp(String id)throws CustomEmployeeException
		{
			List<ReimbursementEntity> elist=new ArrayList<ReimbursementEntity>();
			
			try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				String q="from ReimbursementEntity where employee.employeeId=\'"+id+"\' ";
				Query q1=session.createQuery(q); 
			    
				
				elist=q1.list();	
				
			} catch (Exception e1) {
				
				throw new CustomEmployeeException("Invalid insert data");
			}
			 
			return elist;
			
		}
		
		//reimbursement view all  tables
		public List<ReimbursementEntity> rebdetails(String id)throws CustomEmployeeException
		{
			List<ReimbursementEntity> elist=new ArrayList<ReimbursementEntity>();
			
			try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				String q="from ReimbursementEntity  where employee.employeeId=\'"+id+"\' ";
				Query q1=session.createQuery(q); 
			    
				
				elist=q1.list();	
				
			} catch (Exception e1) {
				
				throw new CustomEmployeeException("Invalid insert data");
			}
			 
			return elist;
			
		}
			
			//Employee All view
			public List<EmployeeEntity> DetailsEmployee(String id)throws CustomEmployeeException
			{
				
				List<EmployeeEntity> elist=new ArrayList<EmployeeEntity>();
				
				try {
							
							Session session=HibernateUtil.getSessionFactory().openSession();
							String q="From EmployeeEntity f where f.employeeId=\'"+id+"\' ";
							Query q1=session.createQuery(q); 
						    
							
							elist=q1.list();	
							
						} catch (Exception e1) {
							
							throw new CustomEmployeeException("Invalid insert data");
						}
						 
						return elist;
				
			}
			
			//Manager view the Employee Details
			public List<ReimbursementEntity> viewAllEmpRequest()throws CustomEmployeeException
			{
				List<ReimbursementEntity> elist=new ArrayList<ReimbursementEntity>();
				
				try {
					
					Session session=HibernateUtil.getSessionFactory().openSession();
					Query q=session.createQuery("from ReimbursementEntity e"); 
					elist=q.list();	
					
				} catch (Exception e1) {
					
					throw new CustomEmployeeException("Invalid insert data");
				}
				 
				return elist;
			}
			
			//manager accept and deny process
			public List<ReimbursementEntity> viewAllpending()throws CustomEmployeeException
			{
				List<ReimbursementEntity> elist=new ArrayList<ReimbursementEntity>();
				
				try {
					
					Session session=HibernateUtil.getSessionFactory().openSession();
				
					String q="From ReimbursementEntity f where f.status=null";
					Query q1=session.createQuery(q); 
				   
					elist=q1.list();	
					
				} catch (Exception e1) {
					
					throw new CustomEmployeeException("Invalid insert data");
				}
				 
				return elist;
			}
			
			//manager  view current accept and pending status 
			public void ManagerUpdateRequest(Integer reimbursementId,String status) throws CustomEmployeeException
			{
				try {
					
					Session session=HibernateUtil.getSessionFactory().openSession();
					session.beginTransaction();  
					
				
					ReimbursementEntity rde=session.load(ReimbursementEntity.class, reimbursementId);
					
					rde.setStatus(status);
					session.merge(rde);  
				
					System.out.println("status Updated....");
					session.getTransaction().commit();
					session.close();
					
				} catch (Exception e1) {
					
					throw new CustomEmployeeException("Invalid insert data");
				}
			}
			
			//manager view only accept details 
			public List<ReimbursementEntity> viewonlyaccept()throws CustomEmployeeException
			{
			List<ReimbursementEntity> elist=new ArrayList<ReimbursementEntity>();
			
			try {
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				String q="From ReimbursementEntity f where f.status='Accept'";
				Query q1=session.createQuery(q); 
			   elist=q1.list();	
				
			} catch (Exception e1) {
				
				throw new CustomEmployeeException("Invalid insert data");
			}
			 
			return elist;
			}
			
			//manager view only reject details
			public List<ReimbursementEntity> viewonlyreject()throws CustomEmployeeException{
				List<ReimbursementEntity> elist=new ArrayList<ReimbursementEntity>();
				
				try {
					
					Session session=HibernateUtil.getSessionFactory().openSession();
					String q="From ReimbursementEntity f where f.status='Reject'";
					Query q1=session.createQuery(q); 
					elist=q1.list();	
					
				} catch (Exception e1) {
					
					throw new CustomEmployeeException("Invalid insert data");
				}
				 
				return elist;
			}
	 
			
			//Update Employee
			public void UpdateEmployee(EmployeeDetails employee) throws CustomEmployeeException{
				try {
					Session session=HibernateUtil.getSessionFactory().openSession();
					session.beginTransaction(); 
					EmployeeEntity ee = EmployeeMapper.mapEmployee(employee);
					EmployeeEntity ee1 = session.load(EmployeeEntity.class,ee.getEmployeeId());
					ee1.setEmail(ee.getEmail());
					ee1.setEmployeeName(ee.getEmployeeName());
					ee1.setPassword(ee.getPassword());
					ee1.setDepartment(ee.getDepartment());
					ee1.setDepartment(ee.getDepartment());
					
					session.saveOrUpdate(ee1);
					System.out.println("Profile updated.....");
					
					session.getTransaction().commit();
					
				} catch (Exception e1) {
					
					throw new CustomEmployeeException("Invalid insert data");
				}
			}
			

}
