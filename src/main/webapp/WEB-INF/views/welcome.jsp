<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ page isELIgnored="false" %>
</head>
<body>

	<h2>Yo Bro ${name}!! Long time no see!!</h2>
	
	<h3>${obj} </h3>
	<!-- we have request out and few more gifted obj from scriplets -->

<% String s=(String)request.getAttribute("name");
out.print(s);
%>

<c:forEach items="${elist}" var="item">
    ${item}<br>
</c:forEach>

</body>
</html>