<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <h2> register here</h2>
<form action="register/add" method="post">
name:<input type="text" name="name"><br><br>
password:<input type="password" name="password"><br><br>
email:<input type="text" name="email"><br><br>
contact:<input type="text" name="contact"><br><br>
address:<input type="text" name="address"><br><br>
<input type="submit" value="register"><br><br>
<input type="reset"> --%>

<form:form method="POST" commandName="user" action="register/add" role="form">
       <h2 style="color:#000000;align:center">Please Sign Up</h2>
		<hr class="colorgraph">
		 <div class="row">
		 
		 <div class="col-xs-12 col-md-6">
				<div class="form-group" >
                        <form:input style="background-color:#FFFFE0" required="true" path="id" type="text" name="id" class="form-control input-lg" placeholder="ID" tabindex="1"/>
				</div>
		</div>
				
				<div class="col-xs-12 col-md-6">
					<div class="form-group" >
                        <form:input style="background-color:#FFFFE0" required="true" path="name" type="text" name="name" id="name" class="form-control input-lg" placeholder="Name" tabindex="1"/>
					</div>
				</div>
				
				<div class="col-xs-12 col-sm-6 col-md-6">
					<div class="form-group">
						<form:input style="background-color:#FFFFE0" required="true" path="contact" type="text" name="contact" id="contact" class="form-control input-lg" placeholder="contact" tabindex="2" />
					</div>
				</div>
				
			
			</div>
		
				<div class="col-xs-12 col-sm-6 col-md-6">
					<div class="form-group">
						<form:input style="background-color:#FFFFE0" path="password" required="true"  type="password" name="password" id="password" class="form-control input-lg" placeholder="Password" tabindex="4" />
					</div>
				</div>
				
			<div class="col-xs-12 col-sm-6 col-md-6">
				<div class="form-group">
					<form:input style="background-color:#FFFFE0" required="true"  path="email" type="email" name="email" id="email" class="form-control input-lg" placeholder="Email " tabindex="5" />
				</div>
			</div>
			
			
			<hr class="colorgraph">
			<div class="row">
				<div class="col-xs-12 col-md-6"><input type="submit" value="Register" class="btn btn-primary btn-block btn-lg" tabindex="6" >
			</div>
				<input type="reset" value="Reset" class="btn btn-primary btn-block btn-lg" tabindex="6" >
			
				</div>
       </form:form> 
      </body>
      </html>    