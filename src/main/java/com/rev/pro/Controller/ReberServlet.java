package com.rev.pro.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rev.pro.Entity.ReimbursementEntity;
import com.rev.pro.model.ReimbursementDetails;
import com.rev.pro.service.EmployeeRegistrationService;
import com.rev.pro.service.EmployeeRegistrationServiceImp;

@WebServlet("/RebEmpApp")
public class ReberServlet extends HttpServlet {
	static Logger logger = Logger.getLogger("ReberServlet.class");
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.info("============================== Reimbursement Details Servlet controller ==================================");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String id=String.valueOf(request.getSession().getAttribute("id"));
		String reimtype=request.getParameter("type");
		String reimamount=request.getParameter("amount");


		
		ReimbursementDetails reimdetails=new ReimbursementDetails();
		reimdetails.setType(reimtype);
		reimdetails.setAmount( Double.parseDouble(reimamount));
		reimdetails.setEmpid((request.getSession().getAttribute("id").toString()));
		
		



		
		EmployeeRegistrationService ersservice=new EmployeeRegistrationServiceImp();	
		ersservice.addreimdetails(reimdetails);
		
//		RequestDispatcher rd=request.getRequestDispatcher("RebEmpAppLog.jsp");
//		rd.forward(request, response);
		
		List<ReimbursementEntity> elist=ersservice.displayreimdetailsofemp(id);
		//System.out.println(elist);
		
		
		
		
		out.println("<table border=1 >");
		out.println("<caption> One Employee Reimbursement details </caption>");
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
