package com.rev.pro.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rev.pro.Entity.EmployeeEntity;
import com.rev.pro.Entity.ReimbursementEntity;
import com.rev.pro.service.EmployeeRegistrationService;
import com.rev.pro.service.EmployeeRegistrationServiceImp;


public class Viewallapproved extends HttpServlet {
	static Logger logger = Logger.getLogger("Viewallapproved.class");
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		logger.info("=============================== Manager view Approved controller ==================================");
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				
				EmployeeRegistrationService ersservice=new EmployeeRegistrationServiceImp();
				List<EmployeeEntity> elist=ersservice.displayAllEmployees();
				List<ReimbursementEntity> rlist=ersservice.viewonlyaccept();
				
				//employee details
				out.println("<table border=1 >");
				out.println("<caption> Employee Personal Details </caption>");
				out.println("<tr><th>Employee Id </th><th>Email</th><th>PassWord</th><th>Name</th><th>Department</th><th>Designation</th></tr>");
				for(EmployeeEntity e : elist)
				{
					out.println("<tr><td>"+e.getEmployeeId()+"</td><td>" +e.getEmail()+"</td><td>"+e.getPassword()+"</td><td>"+e.getEmployeeName()+"</td><td>"+e.getDepartment()+"</td><td>"+e.getDesignation()+"</td></tr>");                                              
				}
				out.println("</table>");
				out.println("</br>");
				
				//reimbursement details
				out.println("<table border=1 >");
				out.println("<caption>All Employee Reimbursement details </caption>");
				out.println("<tr><th>Reimbursement Id</th><th>type of Remb</th><th> Amount of Remb</th><th>Status</th><th>Employee Id</th></tr>");
				for(ReimbursementEntity r: rlist)
				{
					out.println("<tr><td>"+r.getReimbursementId()+"</td><td>" +r.getType()+"</td><td>"+r.getAmount()+"</td><td>"+r.getStatus()+"</td><td>"+r.getEmployee()+"</td></tr>");                                              
				}
				out.println("</table>");
				out.println("</br>");
				
				out.println("<form action='Manager.jsp'> <input type='submit' value='back to ManagerPage'></form> ");
	}

}
