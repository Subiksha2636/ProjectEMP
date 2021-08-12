<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Reimbursement View  </title>
<style type="text/css">
h1 {text-align: center;}

	body{
		margin : 0;
		padding : 0;
		font-family :sans-serif;
		background-image:url('ab.png');
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
		background-image:url('abc.jpg');
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




.container {
  display: -ms-flexbox; 
  display: flex;
  width: 100%;
  margin-bottom: 15px;
}
.icon {
  padding: 10px;
  background: #87CEFA;
  color: white;
  min-width: 50px;
  text-align: center;
}
.field {
  width: 100%;
  padding: 10px;
  outline: none;
}
.field:focus {
  border: 2px solid black;
}

.btn {
  background-color:#87CEFA;
  color: blank;
 

  cursor: pointer;
  width: 100%;
  opacity: 0.9;
  text-align:center;
}


.btn:hover {
  opacity: 1;
}
</style>
</head>
<body>
<div class="center">
<h2> <i>Welcome Employees </i> </h2>

<form action="" method="post" >
  
  <div class="container">
    <i class="icon"></i>
    <input class="field" type="text" placeholder="Id" name="id" required>
  </div>

  <div class="container">
    <i class="icon"></i>
    <input class="field" type="text" placeholder="Email" name="email">
  </div>
  
  <div class="container">
    <i class="icon"></i>
    <input class="field" type="password" placeholder="Password" name="pwd" required>
  </div>

<div class="btn">
  <button type="submit">Go to Status Page</button>
  </div>
  

</form>

</div>

</body>
</html>