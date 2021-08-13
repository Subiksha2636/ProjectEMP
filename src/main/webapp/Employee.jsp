<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Employee Page </title>
<style>
body{ margin :0;
	padding:0;
	background-image:url('emp2.jpg');
	background-repeat:no-repeat;
	background-size:cover;
	font-family:Helvetica;
}
.title{
	text-align:center;
	padding:50px 0 20px;
	
}
.title h2{
	margin:0;
	padding:0;
	color:black;
	font-family:Helvetica;
	font-size:30px;
}
.container{
	width:60%;
	height:400px;
	background:#fff;
	margin: 0 auto;
	border:2px solid #fff;
	box-shadow: 0 15px 40px ;
}
.container .left{
	float:left;
	width : 50%;
	height:400px;
	background-image : url('manager1.jpg');
	background-repeat:no-repeat;
	background-size:cover;
	box-sizing:border-box;
}
.container .rigth{
	float:right;
	background :#f90606;
	color:red;
	width:70%;
	height:400px;
	
}
.formBox{
	width:100%;
	padding:80px 40px;
	box-sizing:border-box;
	height:400px;
	background:	#00bfff;
}
.formBox input{
	margin-bottom:20px;
}
.formBox input[type="submit"]
{
	border : none;
	outline:none;
	height:40px;
	color:#fff;
	background: #262626;
	cursor:pointer;
}
.formBox input[type="submit"]:hover
{
	background : #a6af13;
}

</style>
</head>
<body>

<div class="title"> <h2><i>Welcome To Employee Page </i></h2>

<div class="container">
	<div class="left"></div>
	<div class="right">
		<div class="formBox">
			<form action="RebEmpApp.jsp">
			<input type="submit" value=" Reimbursement Application">
			</form>
			
			<form action="UpdateEmployee.jsp">
			<input type="submit" value=" Update Employee">
			</form>
			
			<form action="Rebdetails"  method="post">
			<input type="submit" value=" View Your Reimbursement Details">
			</form>
			
			<form action="Detailsemployee"  method="post">
			<input type="submit" value=" View Your Personal Details">
			</form>
			
			<form action="Login.jsp">
			<input type="submit" value=" Log out">
			</form>
		</div>
	</div>
</div>
</div>


</body>
</html>