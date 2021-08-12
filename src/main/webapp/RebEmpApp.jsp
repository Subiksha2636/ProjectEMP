<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css"> 
body{
		margin : 0;
		padding : 0;
		font-family : Times New Roman;
		background-image:url('fifth.jpg');
		background-repeat:no-repeat;
		background-size:cover;
		background-position:center;
		height: 100vh;
		overflow: hidden;
		text-align:center;
	}
.button{background-color : white;
		color: black;
		border: 2px  solid #4CAF50 }
</style>
</head>
<body>
	<div>
	<h1> Reimbursements Details  </h1>
	
	<form action="ReberServlet"  method="post">
		<div>
		<label>Employee ID  </label>
		<input type="text"  name="id" required /><br><br>
		</div>
		
		<div>
		<label>Employee Name  </label>
		<input type="text"  name="email" /><br><br>
		</div>
		
		<div>
		  <label>Reimbursement Type  </label> 
		  <select id="type" name="type" required>
          <option value="Travel and Mileage Reimbursements">Travel and Mileage Reimbursements</option>
          <option value="Business Expense Reimbursements">Business Expense Reimbursements</option>
          <option value="Healthcare Reimbursements">Healthcare Reimbursements</option>
           <option value="Food Reimbursement">Food Reimbursements</option>
          <option value="Others">Others</option>
          </select><br><br>
         </div>
         
         <div> 
          <label for="amount">Amount </label>
          <input type="text"  name="amount" required/><br><br>
          </div>
         
         <div> 
         <input type="submit" value="Submit"/>
         </div><br>
		
		<!--  <button class="button" formaction="Login"> Logout </button>-->
		
			

	</form>
	
		<form action="Login.jsp">
			<input type="submit" value=" Logout">
			</form>
	
	</div>
</body>
</html>
</html>