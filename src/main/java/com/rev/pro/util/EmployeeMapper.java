package com.rev.pro.util;

import com.rev.pro.Entity.EmployeeEntity;
import com.rev.pro.model.EmployeeDetails;

public class EmployeeMapper {
	public static EmployeeEntity mapEmployee(EmployeeDetails e) {
		EmployeeEntity entity = new EmployeeEntity();
		entity.setEmployeeId(e.getEmployeeId());
		entity.setEmployeeName(e.getEmployeeName());
		entity.setDesignation(e.getDesignation());
		entity.setDepartment(e.getDepartment());
		entity.setEmail(e.getEmail());
		entity.setPassword(e.getPassword());
		// entity.setType(e.getType());
		return entity;

	}
}
