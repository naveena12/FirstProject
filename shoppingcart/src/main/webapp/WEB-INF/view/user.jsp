
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<script type="text/javascript" 
src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<title>User Page</title>
<style>
body{ 
background-image: url(resources/images/bgk13.jpg); 
background-size:     cover;                      
    background-repeat:   no-repeat;
 } 
 th{
    color:white;
    background-color:#F0F8FF;
    align:center;
}

table, th, td {
    border: 2.5px solid black;
    align:center;
   
    
}
/* .btn {
    background-color:#cc0052 ;
    } */
h2{
color:#F5F5DC;
font-family: "Times New Roman", Times, serif;
}

h3{
color:#F5F5DC;
font-family: "Times New Roman", Times, serif;
}


</style>
</head>
<body >
<nav class="navbar navbar-inverse" style="margin: 20px 0px 0px 0px;">
  <div class="container-fluid">
    <div class="navbar-header">
      <h2 class="navbar-brand" style="color:#F5F5DC;margin:5px 0px 0px 0px">USERS</h2>
    </div>
    <ul class="nav navbar-nav">
      <li><a style="color:#F5F5DC;margin:5px 0px 0px 0px" href="admin"><span class="glyphicon glyphicon-home"></span></a></li>
     
     </ul>
      <ul class="nav navbar-nav" style="text-align:center">   
       <li><h1 style="color:#F5F5DC;margin:5px 0px 0px 400px" ><center>USERS</center></h1></li>
           		
	 </ul>
     <ul class="nav navbar-nav navbar-right">       
      <li class="divider-vertical"></li>
		<c:if test="${pageContext.request.userPrincipal.name != null}"> 		
			  <li><h4 class="text-right" style="color:#F5F5DC;margin:20px 0px 0px 0px">HELLO, ${pageContext.request.userPrincipal.name}</h4></li>
			<li><a  style="color:#F5F5DC;margin:5px 0px 0px 0px" href="<c:url value="/j_spring_security_logout" />"> <span class="glyphicon glyphicon-log-out"></span> Log Out</a></li>
		</c:if>    
								
     </ul>     
  </div>
</nav>

<div class="container">
   

<h2><center>ADD USER</center></h2>
<c:url var="addAction"  value="/user/add"></c:url>
<form:form action="${addAction }" commandName="user">
<table>
	<tr>
		<td><form:label style="color:#000000" path="id"><spring:message text="ID"/></form:label></td>
		
		
		<c:choose>
			<c:when test="${!empty user.id }">
				<td><form:input style="background-color:#F5F5DC;border:0.25px solid black" path="id" disabled="true" readonly="true"/></td>
			</c:when>
			<c:otherwise>
				<td><form:input style="background-color:#F5F5DC;border:0.25px solid black" path="id"  pattern=".{4,7}" required="true" title="id should be between 4 to 7 characters"/></td>
				</c:otherwise>
				</c:choose>
				</tr>
				
				<tr bgcolor="#F0F8FF"> 
				<form:input path="id" hidden="true"/>
				
				<td><form:label style="color:#000000" path="name"> <spring:message text="NAME"/></form:label></td>
        		<td><form:input style="background-color:#F5F5DC;border:0.25px solid black" path="name" required="true" /></td> 
				</tr>
				
				<tr bgcolor="#F0F8FF">
				<td><form:label style="color:#000000" path="password" ><spring:message text="PASSWORD"/></form:label></td>
				<td><form:input style="background-color:#F5F5DC;border:0.25px solid black" path="password" required="true"/></td>
				</tr>
				<tr bgcolor="#F0F8FF">
				<td><form:label style="color:#000000" path="contact" ><spring:message text="CONTACT"/></form:label></td>
				<td><form:input style="background-color:#F5F5DC;border:0.25px solid black" path="contact" required="true"/></td>
				</tr>
				<tr bgcolor="#F0F8FF">
				<td><form:label style="color:#000000" path="email" ><spring:message text="email"/></form:label></td>
				<td><form:input style="background-color:#F5F5DC;border:0.25px solid black" path="password" required="true"/></td>
				</tr>
				<td><form:label style="color:#000000" path="role" ><spring:message text="role"/></form:label></td>
				<td><form:input style="background-color:#F5F5DC;border:0.25px solid black" path="role" required="true"/></td>
				</tr>
				<tr bgcolor="#F0F8FF">
				<td align="right" colspan="2"><c:if test="${!empty user.name }">
									<input style= "align:middle" type="submit" value="<spring:message text="Edit User"/>"/>
								</c:if>
								<c:if test="${empty user.name }">
									<input style= "align:middle"   type="submit" value="<spring:message text="Add User"/>"/>
								</c:if>
				</td>
				</tr>
</table>
</form:form>
</div>
<br>
<div class="container">

<h3><center>USER LIST</center></h3>
<br>
<c:if test="${!empty userList}">
	<table  class="table" align="center" bordercolor="#800080" BORDER=10>
			<tr bgcolor="#F0F8FF">
				<th style="color:black" width="125" bgcolor="#F0F8FF" align="center">USER ID</th>
				<th style="color:black" width="125" align="center">USER NAME</th>
				<th style="color:black" width="190" align="center">USER PASSWORD</th>
		    	<th style="color:black" width="190" align="center">USER CONTACT</th>
		    	<th style="color:black" width="190" align="center">USER EMAIL</th>
		    	<th style="color:black" width="190" align="center">USER ROLE</th>
				<th style="color:black" width="100" align="center">EDIT</th>
				<th style="color:black" width="100" align="center">DELETE</th>
			</tr>
					<c:forEach items="${USERList}" var="user">
				<tr bgcolor="#FFFFFF">
					<td  style="color:#000000;font-size:120%" align="center">${user.id}</td>
					<td  style="color:#000000;font-size:120%" align="center">${user.name}</td>
					<td style="color:#000000;font-size:120%" align="center">${user.password}</td>
					<td style="color:#000000;font-size:120%" align="center">${user.contact}</td>
					<td style="color:#000000;font-size:120%" align="center">${user.email}</td>
					<td style="color:#000000;font-size:120%" align="center">${user.role}</td>
					<td style="color:#000000;font-size:120%" align="center"><a href="<c:url value='user/edit/${user.id}' />"><button type="button" >Edit</button></a></td>
					<td style="color:#000000;font-size:120%" align="center"><a href="<c:url value='user/remove/${user.id}' />"><button type="button" >Delete</button></a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	</div>





</body>
</html> 