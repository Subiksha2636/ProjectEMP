<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css"href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">
 <script type="text/javascript"> </script>
<style type="text/css">
	body{
		margin : 0;
		padding : 0;
		font-family : Times New Roman;
		background-image:url('second.jpg');
		background-repeat:no-repeat;
		background-size:cover;
		background-position:center;
		height: 100vh;
		overflow: hidden;
	}
	.center{
		position:absolute;
		top : 50%;
		left : 50%;
		transform : translate(-50%, -50%);
		width: 400px;
		background-image:url('fifth.jpg');
		background-repeat:no-repeat;
		background-size:cover;
		background-position:center;
		
		border-radius : 10px;
			}
	.center h1{
		text-align:center;
		padding : 0 0 20px 0;
		border-bottom: 1px solid silver;
	
	}
	
	.center form{
		padding: 0 40px;
		box-sizing: border-box;
	}
	form .main{
		position: relative;
		border-bottom: 2px solid #adadad;
		margin: 30px 0;
	}

	.pass{
		margin : -5px 0 20px 5px;
		color: black;
		cursor: pointer;
	}
	
	.pass:hover{
		text-decoratin: underline;
	}
	
	.signup{
		margin:30px 0;
		text-align: center;
		font-size: 16px;
		color:#666666
	}
	
	.signup a{
		color: purple;
		text-decoration : none;
	}
	.signup a:hover{
		text-decoration:underline;
	}
</style>
<title> Login Page </title>
</head>
<body>

	<div class="center">
	<h2 style="text-align:center"> Login Form   </h2>
	
	<form action="LoginServlet" method="post">
	
	<div class="main">
	<label> ID </label><br/>
	<input  type="text" name ="id" requried/>
	</div>
	
	<div class="main">
	<label> Email   </label><br/>
	<input  type="email" name= "username" required/> 
	
	
	</div>
	
	<div class="main">
	<label> Password  </label><br/>
	<input  type="password" name ="password" required/>
	</div>
	
	<div class="main">
	<label> Employee </label><br/>
	<input  type="text" name ="emp" />
	</div>
	
	<div class="main">
	<label> Manager </label><br/>
	<input  type="text" name ="mana" />
	</div>
	
	
	
     
    <div class="pass"> 
    <a href="ForgetPass.jsp" > Forget Password </a>
    </div> 
    
	<input type="submit" value="Submit" name="LoginServlet" />
	<input type="Reset" value="Reset"> 
	
	
	<!--  <input type="submit" value="Application" name="NextLoginServlet"/> -->
	
	<div class="signup"> Not a member ? 
	<a href="Reg.jsp" > SignUp </a>
	</div>
	
	
	</form>
	</div>
</body>
</html>