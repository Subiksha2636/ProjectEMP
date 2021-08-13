package com.rev.pro.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rev.pro.Entity.ReimbursementEntity;
import com.rev.pro.model.ReimbursementDetails;
import com.rev.pro.service.EmployeeRegistrationService;
import com.rev.pro.service.EmployeeRegistrationServiceImp;




public class Rebdetails extends HttpServlet {
	static Logger logger = Logger.getLogger("Rebdetails.class");
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("================================= Reimbursement Details  controller ==================================");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String id=String.valueOf(request.getSession().getAttribute("id"));
		ReimbursementDetails reimdetails=new ReimbursementDetails();
		reimdetails.setEmpid((request.getSession().getAttribute("id").toString()));
		
		EmployeeRegistrationService ersservice=new EmployeeRegistrationServiceImp();
		List<ReimbursementEntity> elist=ersservice.rebdetails(id);
		
		out.println("<table border=1 >");
		out.println("<caption>All Employee Reimbursement details </caption>");
		out.println("<tr><th>Reimbursement Id</th><th>type of rem</th><th> Amount of rem </th><th>Status</th><th>Employee Id</th> </tr>");
		for(ReimbursementEntity e: elist)
		{
			out.println("<tr><td>"+e.getReimbursementId()+"</td><td>" +e.getType()+"</td><td>"+e.getAmount()+"</td><td>"+e.getStatus()+"</td><td>"+e.getEmployee()+"</td></tr>");                                              
		}
		out.println("</table>");
		out.println("</br>");
		out.println("<form action='Employee.jsp'> <input type='submit' value='back to Home'></form> ");
	}

}
