<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
		margin : 0;
		padding : 0;
		font-family : Times New Roman;
		background-image:url('First.jpg');
		background-repeat:no-repeat;
		background-size:cover;
		background-position:center;
		height: 100vh;
		overflow: hidden;
		text-align:center;
	}
</style>
</head>
<body>
	<div>
	<h1> REGISTRATION  PAGE </h1>
	
	<form action="EmployeeController" method="post">
	
	<div>
   <label>	Employee ID</label>
     <Input  type="text" name="id" required><br/><br/>
	</div>
		<div>
        <label>Email ID</label>
        <input  type="email" name="email" required><br/><br/>
     	</div>
     	
		<div>
       <label>Password</label>
        <Input  type="password" name="pwd" required><br/><br/>
       	</div>
       
    	<div>
       <label>Name</label>
        <input  type="text" name="name" required><br/><br/>
      	</div>
      	
      	
   
  		 <div>
       <label>Department</label>
		<input  type="text" name="dep" required><br/><br/>
		</div>
      	
      	<div>
       <label>Designation</label>
        <input  type="text" name="des" required><br/><br/>
		</div>
		
		<div>
        <input type="reset" value="Reset">
        <input type="submit" value="submit"> 
        </div>
      
      <p><b>Already have an account?</b><a href="Login.jsp"><b>user login here</b></a> </p>
      

  </form>
</div>
	
	
</body>
</html>