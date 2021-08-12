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



@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		EmployeeDetails employee=new EmployeeDetails();
		String email=request.getParameter("username");
		String id = request.getParameter("id");
		//employee.setEmail(email);
		Integer empid=Integer.valueOf(id);
		
//		String username = request.getParameter("username");
//		employee.setEmail(username);
		String password = request.getParameter("password");
		String emp = request.getParameter("emp");
		String mana = request.getParameter("mana");

		EmployeeRegistrationServiceImp ersservice=new EmployeeRegistrationServiceImp();
		List<EmployeeEntity> elist=ersservice.displayAllEmployees();
				
		
		boolean isPresent=false;
		RequestDispatcher rd=null;
		
		for(EmployeeEntity e:elist) {
			if(email.equals(e.getEmail()) && empid.equals(e.getEmployeeId()) && emp.equals("employee") && (!(mana.equals("manager"))))
			{
				isPresent=true;
				break;
			}
		}
		
		if(isPresent)
		{
			request.getSession().setAttribute("id", id);			
			rd=request.getRequestDispatcher("Employee.jsp");
			rd.forward(request, response);
			//out.println("appplication");
		}
		else if(mana.equals("manager") && email.equals("manager@gmail.com") && password.equals("1234"))
		{
			request.getSession().setAttribute("id", id);	
			rd=request.getRequestDispatcher("Manager.jsp");
			rd.forward(request, response);
			//out.println("manager");
		}
		
		else
		{
			rd=request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
			//out.println("not yet");
		}
		
		
		

	}

}
