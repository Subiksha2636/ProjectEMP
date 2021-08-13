package com.rev.pro.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rev.pro.service.EmployeeRegistrationService;
import com.rev.pro.service.EmployeeRegistrationServiceImp;

public class ManagerviewApproveDeny extends HttpServlet {
	static Logger logger = Logger.getLogger("ManagerViewApproveDeny.class");
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.info("=============================  ManagerviewApprove Deny  controller ==================================");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String reimbursementId=request.getParameter("reimbursementId");
		String type=request.getParameter("type");
		EmployeeRegistrationService ersservice=new EmployeeRegistrationServiceImp();	
		Integer id=Integer.parseInt(reimbursementId);
		ersservice.ManagerUpdateRequest(id, type);
		
		out.println("<table border=1>");
		out.println("<tr><th> Reimbursement Id</th><th>Status</th></tr>");
		out.println("<tr><td>"+reimbursementId+"</td><td>"+type+"</td></tr>");
		out.println("</table>");
		
		out.println("<br/><br/>");
		
		out.println(" Update the Employee Status  , Please go back to home");
		out.println("<br/><br/>");
		out.println("<form action='Manager.jsp'> <input type='submit' value='back to ManagerPage'></form> ");
	}

}
