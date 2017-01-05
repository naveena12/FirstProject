<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> login here</h2>

<!-- <form action="validate"> -->
<!-- userID:<input type="text" name="username"> -->
<!-- password:<input type="password" name="password"> -->
<!-- <input type="submit" value="login"> -->
<!-- </form> -->


<form  action="<c:url value="j_spring_security_check"/>"  method="post" role="form">
       <c:if test="${not empty loginerror}">
       <p class="loginerror" >${loginerror}</p>
       </c:if>
       
       <c:if test="${not empty loginmsg}">
       <p class="loginmsg" >${loginmsg}</p>
       </c:if>
          <h2 style="color:#000000">Please Login</h2>
	     <hr class="colorgraph"> 
        <div class="row">
				<div class="col-sm-12 ">
					<div class="form-group">
						<input style="background-color:#FFFFE0" type="text"  name="username" class="form-control input-lg" placeholder="Name" tabindex="1" />
					</div>
				</div>
			
				
			</div>
			 <div class="row">
				<div class="col-xs-12">
					<div class="form-group">
						<input style="background-color:#FFFFE0" type="password"  name="password" class="form-control input-lg" placeholder="Password" tabindex="2" />
					</div>
				</div>
			
				
			</div>
			<hr class="colorgraph"> 
 			<div class="row">
				<div class="col-xs-12 col-md-6"><input type="submit" value="Submit" class="btn btn-primary btn-block btn-lg" tabindex="7"></div>
				
			</div>

		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

			
        </form>

</body>
</html>