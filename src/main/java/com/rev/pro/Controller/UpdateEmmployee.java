package com.rev.pro.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rev.pro.Entity.EmployeeEntity;
import com.rev.pro.model.EmployeeDetails;
import com.rev.pro.service.EmployeeRegistrationService;
import com.rev.pro.service.EmployeeRegistrationServiceImp;

@WebServlet("/UpdateEmployee")
public class UpdateEmmployee extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String id=String.valueOf(request.getSession().getAttribute("id"));
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
		
		EmployeeRegistrationService ersservice=new EmployeeRegistrationServiceImp();
		ersservice.UpdateEmployee(employee);
		
		out.println("<h1>Your Profile got updated Successfully.......</h1>");
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


