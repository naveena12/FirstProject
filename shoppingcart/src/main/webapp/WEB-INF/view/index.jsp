<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
 
 
 
 ${successmessage}  
 <c:if test="${errormessage}"> 
 </c:if>   
   
   
     <c:if test="${userClickedlogin }"> 
    </c:if> 
     <c:if test="${userClickedRegister }"> 
   
     </c:if> 
    
 <jsp:include page="navbar.jsp"></jsp:include> 
 <center>  
 <h1> SHOPPING WORLD </h1> 
</center> 
<jsp:include page="carousel.jsp"></jsp:include>  

  
    
</body>

</html>