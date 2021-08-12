package com.rev.pro.util;

import com.rev.pro.Entity.EmployeeEntity;
import com.rev.pro.Entity.ReimbursementEntity;
import com.rev.pro.model.EmployeeDetails;
import com.rev.pro.model.ReimbursementDetails;

public class ReimbursementMapper {
	public static ReimbursementEntity mapReimEmployee(ReimbursementDetails ed) {
		
		ReimbursementEntity reimentity=new ReimbursementEntity();
		reimentity.setReimbursementId(ed.getReimbursementId());
		reimentity.setAmount(ed.getAmount());
		reimentity.setType(ed.getType());
		reimentity.setStatus(ed.getStatus());
		
//		
//		<EmployeeEntity> blist=session.createQuery("from EmployeeEntity b ").list();
//		for( EmployeeEntity b: blist) {
//			Set<ReimbursementRequest> sset=b.getRequestset();
//			System.out.println(b.getEmployeeId());
//			for( ReimbursementRequest ss:sset)
//			{  System.out.println(ss.getRid()+"   "+ss.getAmount());
//				
//			}

		
		return reimentity;
		
	}
}