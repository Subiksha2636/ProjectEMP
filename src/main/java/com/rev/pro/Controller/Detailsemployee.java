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
import com.rev.pro.model.EmployeeDetails;
import com.rev.pro.service.EmployeeRegistrationService;
import com.rev.pro.service.EmployeeRegistrationServiceImp;


public class Detailsemployee extends HttpServlet {
	static Logger logger = Logger.getLogger("Detailsemployee.class");
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("==========================Display  Employee controller ==================================");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String id=String.valueOf(request.getSession().getAttribute("id"));
		EmployeeDetails ee = new EmployeeDetails();
		ee.setEmployeeId(Integer.valueOf(id));
		
		EmployeeRegistrationService ersservice=new EmployeeRegistrationServiceImp();
		List<EmployeeEntity> elist=ersservice.DetailsEmployee(id);
		
		out.println("<table border=1 >");
		out.println("<caption> Employee Personal Details </caption>");
		
		out.println("<tr><th>Employee Id </th><th>Email</th><th>PassWord</th><th>Name</th><th>Department</th><th>Designation</th></tr>");
		for(EmployeeEntity e : elist)
		{
			out.println("<tr><td>"+e.getEmployeeId()+"</td><td>" +e.getEmail()+"</td><td>"+e.getPassword()+"</td><td>"+e.getEmployeeName()+"</td><td>"+e.getDepartment()+"</td><td>"+e.getDesignation()+"</td></tr>");                                              
		}
		out.println("</table>");
		out.println("</br>");
		out.println("<form action='Employee.jsp'> <input type='submit' value='back to Home'></form> ");
	}

}
