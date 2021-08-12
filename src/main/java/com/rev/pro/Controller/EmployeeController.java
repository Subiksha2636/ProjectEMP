package com.rev.pro.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rev.pro.Entity.EmployeeEntity;
import com.rev.pro.model.EmployeeDetails;
import com.rev.pro.service.EmployeeRegistrationService;
import com.rev.pro.service.EmployeeRegistrationServiceImp;



@WebServlet("/Reg")
public class EmployeeController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
				
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		String name=request.getParameter("name");
		String des=request.getParameter("des");
		String dep=request.getParameter("dep");
		String email=request.getParameter("email");
	
		EmployeeDetails employee=new EmployeeDetails();
		employee.setEmployeeId(Integer.parseInt(id));
		employee.setEmployeeName(name);
		employee.setDepartment(dep);
		employee.setDesignation(des);
		employee.setEmail(email);
		employee.setPassword(pwd);
		
		
		
		EmployeeRegistrationService employeeService =new EmployeeRegistrationServiceImp();
		List<EmployeeEntity> elist=employeeService.displayAllEmployees();
		
		boolean isPresent=false;
		RequestDispatcher rd=null;
		
		for(EmployeeEntity e:elist) {	
			if(email.equals(e.getEmail())) 
			{
				isPresent=true;
				break;
			}
		}
		if(isPresent) 
		{
			rd=request.getRequestDispatcher("AlreadyReg.jsp");
			rd.forward(request, response);
		}
		else 
		{
			employeeService.addEmployee(employee);
			rd=request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
		
			
	}

	

}
