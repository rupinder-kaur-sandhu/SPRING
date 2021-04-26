<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	1) ask Web server to instantiate the RegBean class
	2) ask webserver to inject inputs from query string in request into bean object by calling correspondingly named etters
	3)ask web server to store populated instantiated bean in scope
	4) forward to url pattern(controller servlet)
	 -->
	 
	 <jsp:useBean id="reg" class="com.uttara.test.RegBean" scope="request">
	   <jsp:setProperty name="reg" property="*"/>
	 </jsp:useBean>
	 <jsp:forward page="register.do"/>
</body>
</html>