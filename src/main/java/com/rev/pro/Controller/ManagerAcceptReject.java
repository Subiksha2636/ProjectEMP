package com.rev.pro.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rev.pro.Entity.EmployeeEntity;
import com.rev.pro.Entity.ReimbursementEntity;
import com.rev.pro.service.EmployeeRegistrationService;
import com.rev.pro.service.EmployeeRegistrationServiceImp;



public class ManagerAcceptReject extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		EmployeeRegistrationService ersservice=new EmployeeRegistrationServiceImp();	
		
		
		List<EmployeeEntity> elist=ersservice.displayAllEmployees();
		List<ReimbursementEntity> rlist=ersservice.viewAllpending();
		
		out.println("<table border=1 >");
		out.println("<caption> Employee Personal Details </caption>");
		
		out.println("<tr><th>Employee Id </th><th>Email</th><th>PassWord</th><th>Name</th><th>Department</th><th>Designation</th></tr>");
		for(EmployeeEntity e : elist)
		{
			out.println("<tr><td>"+e.getEmployeeId()+"</td><td>" +e.getEmail()+"</td><td>"+e.getPassword()+"</td><td>"+e.getEmployeeName()+"</td><td>"+e.getDepartment()+"</td><td>"+e.getDesignation()+"</td></tr>");                                              
		}
		out.println("</table>");
		out.println("</br>");
		
		out.println("<table border=1 >");
		out.println("<caption>All Employee Reimbursement details </caption>");
		out.println("<tr><th>Reimbursement Id</th><th>type of Reim</th><th> Amount of Reim </th><th>Status</th><th>Employee Id</th> </tr>");
		for(ReimbursementEntity e: rlist)
		{
			out.println("<tr><td>"+e.getReimbursementId()+"</td><td>" +e.getType()+"</td><td>"+e.getAmount()+"</td><td>"+e.getStatus()+"</td><td>"+e.getEmployee()+"</td></tr>");                                              
		}
		out.println("</table>");
		out.println("</br>");
		
		out.println("<h1> Manager Accept and Deny Process </h1>" );
		
		out.println("<form action='ManagerviewApproveDeny'  method='post'>");
		out.println("<caption> Updated Reimbursement Id : </caption>");
		out.println("<select name='reimbursementId'>");
		for(ReimbursementEntity r:rlist) {
			
			out.println("<option name='reimbursementId'>"+r.getReimbursementId()+"");
		}
		out.println("</select>");
		out.println("<input type='submit' name='type' value='Accept'/>");
		out.println("<input type='submit' name='type' value='Reject'/>");
		out.println("</form>");
		
		out.println("<br/><br/>");
		
		out.println("<form action='Manager.jsp'> <input type='submit' value='back to ManagerPage'></form> ");

	}

}
